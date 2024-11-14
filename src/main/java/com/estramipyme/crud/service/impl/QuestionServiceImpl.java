package com.estramipyme.crud.service.impl;

import com.estramipyme.crud.dto.request.CreateQuestionDTO;
import com.estramipyme.crud.dto.response.QuestionDTO;
import com.estramipyme.crud.persistence.entities.Question;
import com.estramipyme.crud.persistence.repositories.QuestionRepository;
import com.estramipyme.crud.service.interfaces.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuestionServiceImpl implements IQuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public QuestionDTO createQuestion(CreateQuestionDTO createQuestionDTO) {
        Question question = new Question();
        question.setSection(createQuestionDTO.getSection());
        question.setStatement(createQuestionDTO.getStatement());
        question.setSubsection(createQuestionDTO.getSubsection());
        question = questionRepository.save(question);
        return new QuestionDTO(question);
    }

    @Override
    public QuestionDTO getQuestionById(Long id) {
        Question question = questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Question not found"));
        return new QuestionDTO(question);
    }

    @Override
    public List<QuestionDTO> getAllQuestions() {
        return questionRepository.findAll().stream().map(QuestionDTO::new).collect(Collectors.toList());
    }

    @Override
    public QuestionDTO updateQuestion(Long id, CreateQuestionDTO createQuestionDTO) {
        Question question = questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Question not found"));
        question.setSection(createQuestionDTO.getSection());
        question.setStatement(createQuestionDTO.getStatement());
        question.setSubsection(createQuestionDTO.getSubsection());
        question = questionRepository.save(question);
        return new QuestionDTO(question);
    }

    @Override
    public void deleteQuestion(Long id) {
        questionRepository.deleteById(id);
    }
}