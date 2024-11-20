package com.estramipyme.crud.dto.request;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreateResponseDTO {

    @NotNull
    private Long userId;

    @NotNull
    private Long questionId;

    @NotNull
    private String responseText;
}
