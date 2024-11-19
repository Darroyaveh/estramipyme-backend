package com.estramipyme.crud.persistence.repositories;

import com.estramipyme.crud.persistence.entities.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
    List<Question> findBySection(String section);
    List<Question> findBySubsection(String subsection);

    // Consulta que aprovecha la capacidad de Hibernate para manejar tipos complejos
    @Query("SELECT q FROM Question q WHERE q.section = :section AND q.subsection IS NOT NULL")
    List<Question> findQuestionsWithSubsectionInSection(String section);
}