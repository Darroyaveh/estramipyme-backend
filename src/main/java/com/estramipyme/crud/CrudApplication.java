package com.estramipyme.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

}
