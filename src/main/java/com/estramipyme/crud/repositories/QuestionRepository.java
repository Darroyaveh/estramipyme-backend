package com.estramipyme.crud.repositories;

import com.estramipyme.crud.models.Question;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface QuestionRepository extends MongoRepository<Question, String> {

	Optional<Object> findByQuestion(String question);

	List<Question> findBySection(String section);
}