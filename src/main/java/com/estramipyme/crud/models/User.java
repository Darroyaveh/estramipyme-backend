package com.estramipyme.crud.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document("User")
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

	public User(){}

	public User(String id, String firstName, String lastName, String email, String password, String personType, String docType, String docNumber, String sector,  String role, boolean acceptPolicy) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.personType = personType;
		this.docType = docType;
		this.docNumber = docNumber;
		this.sector = sector;
		this.role= role;
		this.acceptPolicy = acceptPolicy;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getId() {
		return id;
	}

//	public void setId(String id) {
//		this.id = id;
//	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPersonType() {
		return personType;
	}

	public void setPersonType(String personType) {
		this.personType = personType;
	}

	public String getDocType() {
		return docType;
	}

	public void setDocType(String docType) {
		this.docType = docType;
	}

	public String getDocNumber() {
		return docNumber;
	}

	public void setDocNumber(String docNumber) {
		this.docNumber = docNumber;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isAcceptPolicy() {
		return acceptPolicy;
	}

	public void setAcceptPolicy(boolean acceptPolicy) {
		this.acceptPolicy = acceptPolicy;
	}
}

