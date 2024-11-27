package com.estramipyme.crud.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Form")
public class Form {

	@Id
	private String id;


	private int seleccionOpcionDemografia;


	private float promedioForms;



}
