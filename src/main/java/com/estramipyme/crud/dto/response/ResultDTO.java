package com.estramipyme.crud.dto.response;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.Map;

@Data
public class ResultDTO {
    private Long id;
    private Long userId;
    private Map<String, SectionResultDTO> sections;
    private double finalAverage;
    private LocalDateTime createdAt;
    private String Sections; 
}

@Data
class SectionResultDTO {
    private double sectionAverage;
    private Map<Long, Integer> questionResponses;
}
