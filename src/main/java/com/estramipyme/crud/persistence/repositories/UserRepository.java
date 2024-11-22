package com.estramipyme.crud.persistence.repositories;

import com.estramipyme.crud.persistence.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Optional<User> findById(int id);
    Optional<User> findByName(String fullName);
    Optional<User> findByEmail(String email);
    Optional<User> findByDocNumber(String docNumber);
    boolean existsByEmail(String email);
}


