package com.estramipyme.crud.dto.request;

import java.util.List;

public class CreateQuestionDTO {
    private String title; // Título de la pregunta
    private List<CreateOptionDTO> options; // Lista de opciones

    public CreateQuestionDTO() {}

    public CreateQuestionDTO(String title, List<CreateOptionDTO> options) {
        this.title = title;
        this.options = options;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<CreateOptionDTO> getOptions() {
        return options;
    }

    public void setOptions(List<CreateOptionDTO> options) {
        this.options = options;
    }
}


