package com.estramipyme.crud.dto.request;

public class CreateResponseDTO {
    private Long userId;      // ID del usuario que responde
    private Long questionId;   // ID de la pregunta
    private Long selectedOptionId; // ID de la opción seleccionada

    public CreateResponseDTO() {}

    public CreateResponseDTO(Long userId, Long questionId, Long selectedOptionId) {
        this.userId = userId;
        this.questionId = questionId;
        this.selectedOptionId = selectedOptionId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public Long getSelectedOptionId() {
        return selectedOptionId;
    }

    public void setSelectedOptionId(Long selectedOptionId) {
        this.selectedOptionId = selectedOptionId;
    }
}