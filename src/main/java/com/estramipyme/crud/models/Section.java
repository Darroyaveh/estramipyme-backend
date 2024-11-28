package com.estramipyme.crud.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Section")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Section {

	@Id
	private String id;
	private String value;
	private String option;
}