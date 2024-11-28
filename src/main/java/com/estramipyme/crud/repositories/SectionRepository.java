package com.estramipyme.crud.repositories;

import com.estramipyme.crud.models.Section;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SectionRepository extends MongoRepository<Section, String> {

}
