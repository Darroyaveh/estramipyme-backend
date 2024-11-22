package com.estramipyme.crud.dto.response;

import lombok.Data;

@Data
public class UserDTO {
    private int id;
    private String fullName;
    private String email;
}