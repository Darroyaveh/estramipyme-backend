// Ubicación: com.estramipyme.crud.persistence.entities.ResultData.java
package com.estramipyme.crud.persistence.entities;

import lombok.Data;
import java.util.Map;
import java.io.Serializable;

@Data
public class ResultData implements Serializable {
    private Map<String, SectionResult> sections;
    private double finalAverage;
}
