package com.estramipyme.crud.dto.request;

public class CreateOptionDTO {

    private String questionId;
    private String optionText;

    public CreateOptionDTO() {}

    public CreateOptionDTO(String questionId, String optionText) {
        this.questionId = questionId;
        this.optionText = optionText;
    }

    public String getQuestionId() {
        return questionId;
    }

    public void setQuestionId(String questionId) {
        this.questionId = questionId;
    }

    public String getOptionText() {
        return optionText;
    }

    public void setOptionText(String optionText) {
        this.optionText = optionText;
    }
}




