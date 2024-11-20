package com.estramipyme.crud.dto.request;

public class CreateOptionDTO {

    private Long questionId;
    private String optionText;

    public CreateOptionDTO() {}

    public CreateOptionDTO(Long questionId, String optionText) {
        this.questionId = questionId;
        this.optionText = optionText;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getOptionText() {
        return optionText;
    }

    public void setOptionText(String optionText) {
        this.optionText = optionText;
    }
}




