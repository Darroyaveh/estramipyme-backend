package com.estramipyme.crud.persistence.repositories;

import com.estramipyme.crud.persistence.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}