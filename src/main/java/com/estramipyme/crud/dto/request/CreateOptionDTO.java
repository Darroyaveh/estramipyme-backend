package com.estramipyme.crud.dto.request;

public class CreateOptionDTO {

    private String text;  //opciones
    private boolean isCorrect;

    public CreateOptionDTO() {}

    public CreateOptionDTO(String text, boolean isCorrect) {
        this.text = text;
        this.isCorrect = isCorrect;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public void setCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }
}





