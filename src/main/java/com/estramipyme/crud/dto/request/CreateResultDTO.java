package com.estramipyme.crud.dto.request;

import java.util.List;

public class CreateResultDTO {

    private Long userId;                   // ID del usuario para quien se crea el resultado
    private List<Long> responseIds;        // Lista de IDs de respuestas
    private Integer score;                 // Puntaje obtenido

    public CreateResultDTO() {}

    public CreateResultDTO(Long userId, List<Long> responseIds, Integer score) {
        this.userId = userId;
        this.responseIds = responseIds;
        this.score = score;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public List<Long> getResponseIds() {
        return responseIds;
    }

    public void setResponseIds(List<Long> responseIds) {
        this.responseIds = responseIds;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}

