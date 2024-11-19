package com.estramipyme.crud.api.controllers;

import com.estramipyme.crud.dto.request.CreateResultDTO;
import com.estramipyme.crud.dto.response.ResultDTO;
import com.estramipyme.crud.service.interfaces.IResultService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/results")
public class ResultController {
    private final IResultService resultService;

    public ResultController(IResultService resultService) {
        this.resultService = resultService;
    }

    @PostMapping
    public ResponseEntity<ResultDTO> createResult(@RequestBody CreateResultDTO createResultDTO) {
        return ResponseEntity.ok(resultService.createResult(createResultDTO));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResultDTO> getResult(@PathVariable Long id) {
        return ResponseEntity.ok(resultService.getResultById(id));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<ResultDTO>> getResultsByUser(@PathVariable Long userId) {
        return ResponseEntity.ok(resultService.getResultsByUserId(userId));
    }
}