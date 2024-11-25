package com.estramipyme.crud.services;

import com.estramipyme.crud.models.UserItem;
import com.estramipyme.crud.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataInitializationService {

    @Autowired
    private UserRepository userRepository;

    public void createUserItems() {
        System.out.println("Data creation started...");
        this.userRepository.save(new UserItem("1", "John", "Doe", "john.doe@example.com", "password123", "natural", "cedula", "A12345678", "IT", true));
        this.userRepository.save(new UserItem("1", "John", "Doe", "john.doe@example.com", "password123", "natural", "cedula", "A12345678", "IT", true));
        this.userRepository.save(new UserItem("2", "Jane", "Smith", "jane.smith@example.com", "password456", "juridica", "nit", "B87654321", "HR", true));
        this.userRepository.save(new UserItem("3", "Bob", "Johnson", "bob.johnson@example.com", "password789", "natural", "cedula", "C12389012", "Marketing", true));
        this.userRepository.save(new UserItem("4", "Alice", "Williams", "alice.williams@example.com", "password012", "juridica", "nit", "D45678901", "Sales", true));
        this.userRepository.save(new UserItem("5", "Michael", "Brown", "michael.brown@example.com", "password345", "natural", "cedula", "E98765432", "Finance", true));
        
        System.out.println("Data creation complete...");
    }
}
