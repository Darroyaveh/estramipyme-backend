package com.estramipyme.crud.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.estramipyme.crud.models.User;

public interface UserItemRepository extends MongoRepository<User, String> {
	@Query("{firstName:'?0', lastName:'?1'}")
	User findUserByName(String firstName, String lastName);

	@Query("{docNumber:'?0'}")
	User findUserByDocNumber(String docNumber);

	@Query("{email:'?0'}")
	User findUserByEmail(String email);

	@Query("{id:'?0'}")
	User findUserById(String id);

	List<User> findAll();

	public long count();
}
