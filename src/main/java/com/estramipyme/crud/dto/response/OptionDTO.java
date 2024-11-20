package com.estramipyme.crud.dto.response;

public class OptionDTO {

    private Long id;
    private Long questionId;
    private String optionText;

    public OptionDTO() {}

    public OptionDTO(Long id, Long questionId, String optionText) {
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