package com.estramipyme.crud.repositories;

import com.estramipyme.crud.models.Form;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FormRepository extends MongoRepository<Form, String> {
}
