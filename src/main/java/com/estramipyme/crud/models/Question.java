package com.estramipyme.crud.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Question")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {

	@Id
	private String id;

	private String section;
	private String question;
	private List<String> options;
}
