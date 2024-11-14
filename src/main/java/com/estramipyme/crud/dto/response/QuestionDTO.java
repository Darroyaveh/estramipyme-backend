package com.estramipyme.crud.dto.response;

import com.estramipyme.crud.persistence.entities.Question;
import lombok.Data;

@Data
public class QuestionDTO {
    private Long id;
    private String section;
    private String statement;
    private String subsection;

    public QuestionDTO(Question question) {
        this.id = question.getId();
        this.section = question.getSection();
        this.statement = question.getStatement();
        this.subsection = question.getSubsection();
    }
}