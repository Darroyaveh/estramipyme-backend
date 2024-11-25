package com.estramipyme.crud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.estramipyme.crud.models.UserItem;
import com.estramipyme.crud.repositories.UserRepository;


@SpringBootApplication
@EnableMongoRepositories
public class CrudApplication implements CommandLineRunner {

	@Autowired
	UserRepository userRepository;

	//List<UserItem> userList = new ArrayList<UserItem>();


	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}
	@Override public void run(String... args) throws Exception { 
		// Initialize data or perform any startup logic here 
		System.out.println("Starting the application..."); 
		// Example of data creation
		createUserItems(); 
	}

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
