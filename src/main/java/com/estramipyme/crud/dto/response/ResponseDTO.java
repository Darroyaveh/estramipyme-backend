package com.estramipyme.crud.dto.response;

import lombok.Data;

@Data
public class ResponseDTO {

    private Long id;
    private Long userId;
    private Long questionId;
    private String responseText;
    private String createdAt;
    private String updatedAt;
}
