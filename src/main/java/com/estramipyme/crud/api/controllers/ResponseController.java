package com.estramipyme.crud.api.controllers;

import com.estramipyme.crud.dto.request.CreateResponseDTO;
import com.estramipyme.crud.dto.response.ResponseDTO;
import com.estramipyme.crud.service.interfaces.IResponseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/responses")
@RequiredArgsConstructor
public class ResponseController {

    private final IResponseService responseService;

    @PostMapping
    public ResponseEntity<ResponseDTO> createResponse(@Validated @RequestBody CreateResponseDTO createResponseDTO) {
        return ResponseEntity.ok(responseService.createResponse(createResponseDTO));
    }

    @GetMapping
    public ResponseEntity<List<ResponseDTO>> getAllResponses() {
        return ResponseEntity.ok(responseService.getAllResponses());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseDTO> getResponseById(@PathVariable Long id) {
        return ResponseEntity.ok(responseService.getResponseById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteResponse(@PathVariable Long id) {
        responseService.deleteResponse(id);
        return ResponseEntity.noContent().build();
    }
}
