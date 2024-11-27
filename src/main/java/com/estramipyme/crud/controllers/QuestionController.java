package com.estramipyme.crud.controllers;

//import com.estramipyme.crud.models.Question;
//import com.estramipyme.crud.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/questions")
public class QuestionController {

//	@Autowired
//	private QuestionService questionService;
//
//	@GetMapping
//	public List<Question> getAllQuestions() {
//		return questionService.showAllQuestions();
//	}
//
//	@GetMapping("/{id}")
//	public Question getQuestionById(@PathVariable String id) {
//		return questionService.getQuestionById(id);
//	}
//
//	@PostMapping
//	public Question createQuestion(@RequestBody Question question) {
//		return questionService.createQuestion(question);
//	}
//
//	@PutMapping
//	public Question updateQuestion(@RequestBody Question question) {
//		return questionService.updateQuestion(question);
//	}
//
//	@DeleteMapping("/{id}")
//	public void deleteQuestion(@PathVariable String id) {
//		questionService.deleteQuestion(id);
//	}
}