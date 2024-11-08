package com.estramipyme.crud.persistence.repositories;

import com.estramipyme.crud.persistence.entities.Option;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionRepository extends JpaRepository<Option, Long> {
}