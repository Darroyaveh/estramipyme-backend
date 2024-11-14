package com.estramipyme.crud.service.interfaces;

import com.estramipyme.crud.dto.request.CreateQuestionDTO;
import com.estramipyme.crud.dto.response.QuestionDTO;

import java.util.List;

public interface IQuestionService {
    QuestionDTO createQuestion(CreateQuestionDTO createQuestionDTO);
    QuestionDTO getQuestionById(Long id);
    List<QuestionDTO> getAllQuestions();
    QuestionDTO updateQuestion(Long id, CreateQuestionDTO createQuestionDTO);
    void deleteQuestion(Long id);
}