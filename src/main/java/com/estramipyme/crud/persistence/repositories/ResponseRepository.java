package com.estramipyme.crud.persistence.repositories;

import com.estramipyme.crud.persistence.entities.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResponseRepository extends JpaRepository<Response, Long> {
    List<Response> findByUserId(Long userId);

    List<Response> findByQuestionId(Long questionId);

    List<Response> findByResultId(Long resultId);

    boolean existsByQuestionId(Long questionId);

    // Consulta que cuenta respuestas por usuario
    @Query("SELECT COUNT(r) FROM Response r WHERE r.userId = :userId")
    long countResponsesByUserId(Long userId);
}