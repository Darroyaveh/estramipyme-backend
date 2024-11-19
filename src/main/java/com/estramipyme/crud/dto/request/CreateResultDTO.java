package com.estramipyme.crud.dto.request;

import lombok.Data;
import java.util.Map;

@Data
public class CreateResultDTO {
    private Long userId;
    private Map<String, Map<Long, Integer>> sectionResponses; // section -> (questionId -> responseValue)
}


