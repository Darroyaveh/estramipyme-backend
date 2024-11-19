package com.estramipyme.crud.persistence.repositories;

import com.estramipyme.crud.persistence.entities.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OptionRepository extends JpaRepository<Option, Long> {
    List<Option> findByQuestionId(Long questionId);

    // Consulta que cuenta las opciones por pregunta
    @Query("SELECT COUNT(o) FROM Option o WHERE o.question.id = :questionId")
    long countOptionsByQuestionId(Long questionId);
}