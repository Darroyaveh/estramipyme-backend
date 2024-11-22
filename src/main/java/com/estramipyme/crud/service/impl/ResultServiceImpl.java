// Ubicación: com.estramipyme.crud.service.impl.ResultServiceImpl.java
package com.estramipyme.crud.service.impl;

import com.estramipyme.crud.persistence.entities.*;
import com.estramipyme.crud.persistence.repositories.ResultRepository;
import com.estramipyme.crud.persistence.repositories.UserRepository;
import com.estramipyme.crud.dto.request.CreateResultDTO;
import com.estramipyme.crud.dto.response.ResultDTO;
import com.estramipyme.crud.service.interfaces.IResultService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;
import java.time.LocalDateTime;

@Service
public class ResultServiceImpl implements IResultService {
    private final ResultRepository resultRepository;
    private final UserRepository userRepository;

    public ResultServiceImpl(ResultRepository resultRepository, UserRepository userRepository) {
        this.resultRepository = resultRepository;
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public ResultDTO createResult(CreateResultDTO createResultDTO) {
        User user = userRepository.findById(Math.toIntExact(createResultDTO.getUserId()))
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Usuario no encontrado con ID: " + createResultDTO.getUserId()));

        Result result = new Result();
        result.setUser(user);

        ResultData resultData = new ResultData();
        Map<String, SectionResult> sections = new HashMap<>();
        Map<String, Double> sectionAverages = new HashMap<>();

        // Procesar cada sección
        createResultDTO.getSectionResponses().forEach((sectionName, responses) -> {
            SectionResult sectionResult = new SectionResult();
            sectionResult.setQuestionResponses(responses);

            double sectionAverage = calculateSectionAverage(responses);
            sectionResult.setSectionAverage(sectionAverage);
            sections.put(sectionName, sectionResult);
            sectionAverages.put(sectionName, sectionAverage);
        });

        resultData.setSections(sections);
        resultData.setFinalAverage(calculateFinalAverage(sectionAverages));
        result.setResultData(resultData);

        Result savedResult = resultRepository.save(result);
        return convertToDTO(savedResult);
    }

    @Override
    public ResultDTO getResultById(Long id) {
        Result result = resultRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(
                        HttpStatus.NOT_FOUND, "Resultado no encontrado con ID: " + id));
        return convertToDTO(result);
    }

    @Override
    public List<ResultDTO> getResultsByUserId(Long userId) {
        if (!userRepository.existsById(Math.toIntExact(userId))) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Usuario no encontrado con ID: " + userId);
        }

        List<Result> results = resultRepository.findByUserIdOrderByCreatedAtDesc(userId);
        return results.stream()
                .map(this::convertToDTO)
                .toList();
    }

    @Override
    public List<ResultDTO> getResultsByDateRange(Long userId, LocalDateTime startDate, LocalDateTime endDate) {
        List<Result> results = resultRepository.findByUserIdAndCreatedAtBetween(userId, startDate, endDate);
        return results.stream()
                .map(this::convertToDTO)
                .toList();
    }

    @Override
    public long getUserAttemptCount(Long userId) {
        return resultRepository.countByUserId(userId);
    }

    @Override
    public boolean hasUserCompletedForm(Long userId) {
        return resultRepository.existsByUserId(userId);
    }

    // Solo debe existir una implementación de estos métodos de cálculo
    @Override
    public double calculateSectionAverage(Map<Long, Integer> responses) {
        return responses.values().stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }

    @Override
    public double calculateFinalAverage(Map<String, Double> sectionAverages) {
        return sectionAverages.values().stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);
    }

    private ResultDTO convertToDTO(Result result) {
        ResultDTO dto = new ResultDTO();
        dto.setId(result.getId());
        dto.setUserId((long) result.getUser().getId());
        dto.setFinalAverage(result.getResultData().getFinalAverage());
        dto.setCreatedAt(result.getCreatedAt());
        return dto;
    }
}