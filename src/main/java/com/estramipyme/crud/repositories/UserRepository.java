package com.estramipyme.crud.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.estramipyme.crud.models.UserItem;

public interface UserRepository extends MongoRepository<UserItem, String>{
    @Query("{firstName:'?0', lastName:'?1'}")
	UserItem findUserByName(String firstName, String lastName );

    @Query("{docNumber:'?0'}")
	UserItem findUserByDocNumber(String docNumber);

    @Query("{email:'?0'}")
    UserItem findUserByEmail(String email);
	
	List<UserItem> findAll();
	
	public long count();
}
