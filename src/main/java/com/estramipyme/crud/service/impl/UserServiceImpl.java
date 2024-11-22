package com.estramipyme.crud.service.impl;

import com.estramipyme.crud.dto.request.CreateUserDTO;
import com.estramipyme.crud.dto.response.UserDTO;
import com.estramipyme.crud.persistence.entities.User;
import com.estramipyme.crud.persistence.repositories.UserRepository;
import com.estramipyme.crud.service.interfaces.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(PasswordEncoder passwordEncoder, UserRepository userRepository) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
    }

    public UserDetails loadUserByEmail(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email) .orElseThrow(() -> new UsernameNotFoundException("Correo no encontrado: " + email));
        return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(), new ArrayList<>());
    }

    // CREATE
    public UserDTO createUser(CreateUserDTO createUserDTO) {
        if (userRepository.existsByEmail(createUserDTO.getEmail())) {
            throw new RuntimeException("El email ya está registrado");
        }

        User user = new User();
        user.setEmail(createUserDTO.getEmail());
        user.setPassword(passwordEncoder.encode(createUserDTO.getPassword()));

        User savedUser = userRepository.save(user);
        return convertToDTO(savedUser);
    }

    public User saveUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }


    // READ
    public List<UserDTO> getAllUsers() {
        return userRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public UserDTO getUserById(int id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Usuario no encontrado"));
        return convertToDTO(user);
    }

    public List<UserDTO> getUserByName(String name) {
        return userRepository.findByName(name).stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public List<UserDTO> getUserByEmail(String email) {
        return userRepository.findByEmail(email).stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public Optional<User> findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public Optional<User> findUserByDocNumber(String email) {
        return userRepository.findByDocNumber(email);
    }


    // UPDATE
    public UserDTO updateUser(int id, CreateUserDTO createUserDTO) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Usuario no encontrado"));

        user.setEmail(createUserDTO.getEmail());
        if (!user.getEmail().equals(createUserDTO.getEmail()) &&
                userRepository.existsByEmail(createUserDTO.getEmail())) {
            throw new RuntimeException("El nuevo email ya está en uso");
        }
        user.setEmail(createUserDTO.getEmail());
        if (createUserDTO.getPassword() != null && !createUserDTO.getPassword().isEmpty()) {
            user.setPassword(passwordEncoder.encode(createUserDTO.getPassword()));
        }


        User updatedUser = userRepository.save(user);
        return convertToDTO(updatedUser);
    }

    // DELETE
    public void deleteUser(int id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Usuario no encontrado"));
        userRepository.save(user);
    }

    private UserDTO convertToDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.setId(Math.toIntExact(user.getId()));
        dto.setFullName(user.getFullName());
        dto.setEmail(user.getEmail());
        return dto;
    }
}
