package com.estramipyme.crud.service.interfaces;

import com.estramipyme.crud.dto.request.CreateResultDTO;
import com.estramipyme.crud.dto.response.ResultDTO;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public interface IResultService {
    ResultDTO createResult(CreateResultDTO createResultDTO);
    ResultDTO getResultById(Long id);
    List<ResultDTO> getResultsByUserId(Long userId);

    List<ResultDTO> getResultsByDateRange(Long userId, LocalDateTime startDate, LocalDateTime endDate);

    long getUserAttemptCount(Long userId);

    boolean hasUserCompletedForm(Long userId);

    double calculateSectionAverage(Map<Long, Integer> responses);
    double calculateFinalAverage(Map<String, Double> sectionAverages);
}