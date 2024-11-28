package com.estramipyme.crud.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "User")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

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
	private String role;
	private boolean acceptPolicy;
}