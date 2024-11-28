package com.estramipyme.crud.services;

import com.estramipyme.crud.models.Question;
import com.estramipyme.crud.repositories.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {

	@Autowired
	private QuestionRepository questionRepository;

	// Method to show all Questions
	public List<Question> showAllQuestions() {
		return questionRepository.findAll();
	}

	// Method to create Question
	public Question createQuestion(Question question) {
		if (questionRepository.findByQuestion(question.getQuestion()).isPresent()) {
			throw new RuntimeException("Question already exists: " + question.getQuestion());
		}
		return questionRepository.save(question);
	}

	// Method to get Question by id
	public Question getQuestionById(String id) {
		return questionRepository.findById(id)
						.orElseThrow(() -> new RuntimeException("Question not found with id: " + id));
	}

	// Method to get Question by section
	public List<Question> getQuestionsBySection(String section) {
		List<Question> questions = questionRepository.findBySection(section);
		if (questions.isEmpty()) {
			throw new RuntimeException("No questions found in section: " + section);
		}
		return questions;
	}

	// Method to update Question
	public Question updateQuestion(Question question) {
		Optional<Question> existingQuestion = questionRepository.findById(question.getId());

		if (existingQuestion.isPresent()) {
			Question updatedQuestion = existingQuestion.get();
			updatedQuestion.setSection(question.getSection());
			updatedQuestion.setQuestion(question.getQuestion());
			updatedQuestion.setOptions(question.getOptions());
			return questionRepository.save(updatedQuestion);
		} else {
			throw new RuntimeException("Question not found with id: " + question.getId());
		}
	}

	// Method to delete Question
	public void deleteQuestion(String id) {
		Optional<Question> existingQuestion = questionRepository.findById(id);

		if (existingQuestion.isPresent()) {
			questionRepository.deleteById(id);
		} else {
			throw new RuntimeException("Question not found with id: " + id);
		}
	}
}