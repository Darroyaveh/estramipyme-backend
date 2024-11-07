package com.estramipyme.crud.service.interfaces;

import com.estramipyme.crud.dto.request.CreateUserDTO;
import com.estramipyme.crud.dto.response.UserDTO;
import java.util.List;

public interface IUserService {
    UserDTO createUser(CreateUserDTO createUserDTO);
    UserDTO getUserById(Long id);
    List<UserDTO> getAllUsers();
    UserDTO updateUser(Long id, CreateUserDTO createUserDTO);
    void deleteUser(Long id);
}
