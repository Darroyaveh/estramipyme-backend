package com.estramipyme.crud.dto.request;

import lombok.Data;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Pattern;

@Data
public class CreateUserDTO {

    @NotBlank(message = "El nombre es obligatorio")
    @Size(max = 255, message = "El nombre no puede tener más de 255 caracteres")
    private String fullName;

    @NotBlank(message = "El email es obligatorio")
    @Email(message = "El formato del email no es válido")
    @Size(max = 255, message = "El email no puede tener más de 255 caracteres")
    private String email;

    @NotBlank(message = "El número de documento es obligatorio")
    @Size(max = 50, message = "El número de documento no puede tener más de 50 caracteres")
    private String documentNumber;

    @NotBlank(message = "La contraseña es obligatoria")
    @Size(min = 8, message = "La contraseña debe tener al menos 8 caracteres")
    private String password;

    @NotBlank(message = "El sector es obligatorio")
    @Size(max = 255, message = "El sector no puede tener más de 255 caracteres")
    private String sector;

    private boolean acceptPolicy;
}
