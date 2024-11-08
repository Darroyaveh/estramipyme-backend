package com.estramipyme.crud.dto.response;

public class OptionDTO {

    private Long id;
    private String questionId;
    private String optionText;

    public OptionDTO() {}

    public OptionDTO(Long id, String questionId, String optionText) {
        this.id = id;
        this.questionId = questionId;
        this.optionText = optionText;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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