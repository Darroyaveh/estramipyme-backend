package com.estramipyme.crud.api.controllers;

import com.estramipyme.crud.dto.request.CreateUserDTO;
import com.estramipyme.crud.dto.response.UserDTO;
import com.estramipyme.crud.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private IUserService userService;

    // READ
    @GetMapping("/index")
    public ResponseEntity<List<UserDTO>> getAllUsers() {
        List<UserDTO> users = userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable int id) {
        UserDTO user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }

    @GetMapping("/findByName/{name}")
    public ResponseEntity<List<UserDTO>> getUserByName(@PathVariable String name) {
        List<UserDTO> users = userService.getUserByName(name);
        return ResponseEntity.ok(users);
    }

    @GetMapping("/findByEmail/{email}")
    public ResponseEntity<List<UserDTO>> getUserByEmail(@PathVariable String email) {
        List<UserDTO> users = userService.getUserByEmail(email);
        return ResponseEntity.ok(users);
    }

    // UPDATE
    @PutMapping("/update/{id}")
    public ResponseEntity<UserDTO> updateUser(
            @PathVariable int id,
            @Valid @RequestBody CreateUserDTO createUserDTO) {
        UserDTO updatedUser = userService.updateUser(id, createUserDTO);
        return ResponseEntity.ok(updatedUser);
    }

    // DELETE

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }
}
