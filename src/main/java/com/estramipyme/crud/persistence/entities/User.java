package com.estramipyme.crud.persistence.entities;

import java.time.LocalDateTime;

public class User {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String person_type;
    private String doc_type;
    private String doc_number;
    private String sector;
    private String accept_policy;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    public User(int id, String name, String surname, String email, String password, String person_type, String doc_type, String doc_number, String sector, String accept_policy){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.person_type = person_type;
        this.doc_type = doc_type;
        this.doc_number = doc_number;
        this.sector = sector;
        this.accept_policy = accept_policy;
    }

    public User(){}

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getPersonType(){
        return person_type;
    }

    public void setPersonType(String person_type){
        this.person_type = person_type;
    }

    public String getDocType(){
        return doc_type;
    }

    public void setDocType(String doc_type){
        this.doc_type = doc_type;
    }

    public String getDocNumber(){
        return doc_number;
    }

    public void setDocNumber(String doc_number){
        this.doc_number = doc_number;
    }

    public String getSector(){
        return sector;
    }

    public void setSector(String sector){
        this.sector = sector;
    }

    public String getAcceptPolicy(){
        return accept_policy;
    }

    public void setAcceptPolicy(String accept_policy){
        this.accept_policy = accept_policy;
    }
}

