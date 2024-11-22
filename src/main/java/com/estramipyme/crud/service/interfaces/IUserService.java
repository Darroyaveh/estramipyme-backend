package com.estramipyme.crud.service.interfaces;

import com.estramipyme.crud.dto.request.CreateUserDTO;
import com.estramipyme.crud.dto.response.UserDTO;
import com.estramipyme.crud.persistence.entities.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    
    // CREATE
    UserDTO createUser(CreateUserDTO createUserDTO);
    User saveUser(User user);

    // READ
    List<UserDTO> getAllUsers();
    UserDTO getUserById(int id);
    List<UserDTO> getUserByName(String fullName);
    List<UserDTO> getUserByEmail(String email);
    Optional<User> findUserByEmail(String email);
    Optional<User> findUserByDocNumber(String docNumber);

    // UPDATE
    UserDTO updateUser(int id, CreateUserDTO createUserDTO);

    // DELETE
    void deleteUser(int id);
}
