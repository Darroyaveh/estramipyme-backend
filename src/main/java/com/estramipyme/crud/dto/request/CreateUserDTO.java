package com.estramipyme.crud.dto.request;

import lombok.Data;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

@Data
public class CreateUserDTO {
    @NotBlank(message = "El nombre es obligatorio")
    private String name;

    @NotBlank(message = "El email es obligatorio")
    @Email(message = "El formato del email no es válido")
    private String email;

    @NotBlank(message = "La contraseña es obligatoria")
    private String password;

    private String phoneNumber;
}

