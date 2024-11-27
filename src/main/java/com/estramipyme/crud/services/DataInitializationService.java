package com.estramipyme.crud.services;

import com.estramipyme.crud.models.User;
import com.estramipyme.crud.repositories.UserItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataInitializationService {

    @Autowired
    private UserItemRepository userRepository;

    public void createUserItems() {
        System.out.println("Data creation started...");
        this.userRepository.save(new User("1", "John", "Doe", "john.doe@example.com", "password123", "natural", "cedula", "A12345678", "IT", "user", true));
        this.userRepository.save(new User("1", "John", "Doe", "john.doe@example.com", "password123", "natural", "cedula", "A12345678", "IT", "user", true));
        this.userRepository.save(new User("2", "Jane", "Smith", "jane.smith@example.com", "password456", "juridica", "nit", "B87654321", "HR", "user", true));
        this.userRepository.save(new User("3", "Bob", "Johnson", "bob.johnson@example.com", "password789", "natural", "cedula", "C12389012", "Marketing", "user", true));
        this.userRepository.save(new User("4", "Alice", "Williams", "alice.williams@example.com", "password012", "juridica", "nit", "D45678901", "Sales", "user", true));
        this.userRepository.save(new User("5", "Michael", "Brown", "michael.brown@example.com", "password345", "natural", "cedula", "E98765432", "Finance", "user", true));


        System.out.println("Data creation complete...");
    }
}
