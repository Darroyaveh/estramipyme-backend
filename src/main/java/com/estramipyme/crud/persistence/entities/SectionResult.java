// Ubicación: com.estramipyme.crud.persistence.entities.SectionResult.java
package com.estramipyme.crud.persistence.entities;

import lombok.Data;
import java.util.Map;
import java.io.Serializable;

@Data
public class SectionResult implements Serializable {
    private double sectionAverage;
    private Map<Long, Integer> questionResponses; // questionId -> responseValue
}