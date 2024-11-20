package com.estramipyme.crud.api.controllers;

import org.springframework.http.ResponseEntity;

import com.estramipyme.crud.dto.request.CreateResponseDTO;
import com.estramipyme.crud.dto.response.ResponseDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estramipyme.crud.service.interfaces.IResponseService;

@RestController
@RequestMapping("/api/responses")
public class ResponseController {
    
    private final IResponseService responseService;
    
    public ResponseController(IResponseService responseService) {
        this.responseService = responseService;
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> createResponse(@RequestBody CreateResponseDTO createResponseDTO) {
        return ResponseEntity.ok(responseService.createResponse(createResponseDTO));
    }

}
