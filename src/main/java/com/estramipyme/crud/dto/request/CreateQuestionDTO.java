package com.estramipyme.crud.dto.request;

import lombok.Data;

@Data
public class CreateQuestionDTO {
    private String section;
    private String statement;
    private String subsection;
}

