// Ubicación: com.estramipyme.crud.persistence.repositories.ResultRepository.java
package com.estramipyme.crud.persistence.repositories;

import com.estramipyme.crud.persistence.entities.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ResultRepository extends JpaRepository<Result, Long> {
    // Búsqueda de resultados por userId
    List<Result> findByUserId(Long userId);

    // Búsqueda de resultados por userId ordenados por fecha de creación descendente
    List<Result> findByUserIdOrderByCreatedAtDesc(Long userId);

    // Búsqueda de resultados en un rango de fechas
    List<Result> findByUserIdAndCreatedAtBetween(Long userId, LocalDateTime startDate, LocalDateTime endDate);

    // Contar el número de intentos por usuario
    Long countByUserId(Long userId);

    // Verificar si un usuario ya tiene resultados
    boolean existsByUserId(Long userId);
}