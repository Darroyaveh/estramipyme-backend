package com.estramipyme.crud.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("UserItem")
public class UserItem {

    @Id
    private String id;

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String personType;
    private String docType;
    private String docNumber;
    private String sector;
    private boolean acceptPolicy;

    public UserItem(String id, String firstName, String lastName, String email, String password, String personType, String docType, String docNumber, String sector, boolean acceptPolicy) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.personType = personType;
        this.docType = docType;
        this.docNumber = docNumber;
        this.sector = sector;
        this.acceptPolicy = acceptPolicy;
    }
}

