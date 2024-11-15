package com.estramipyme.crud.dto.response;

import lombok.Data;

@Data
public class UserDTO {
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private boolean active;
}