package com.estramipyme.crud.dto.response;

import com.estramipyme.crud.persistence.entities.Question;
import lombok.Data;

@Data
public class ResponseDTO {

    private Long id;
    private Question question;
    private String answer;
    private Long userId;
    private Long resultId;
}