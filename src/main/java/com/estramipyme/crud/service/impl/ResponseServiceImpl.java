package com.estramipyme.crud.service.impl;

import com.estramipyme.crud.dto.request.CreateResponseDTO;
import com.estramipyme.crud.dto.response.ResponseDTO;
import com.estramipyme.crud.persistence.entities.Response;
import com.estramipyme.crud.persistence.repositories.ResponseRepository;
import com.estramipyme.crud.service.interfaces.IResponseService;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ResponseServiceImpl implements IResponseService {

    private final ResponseRepository responseRepository;

    public ResponseServiceImpl(ResponseRepository responseRepository) {
        this.responseRepository = responseRepository;
    }

    @Override
    public ResponseDTO createResponse(CreateResponseDTO createResponseDTO) {
        return null;
    }

    @Override
    public ResponseDTO getResponseById(Long id) {
        return null;
    }

    @Override
    public List<ResponseDTO> getResponsesByUserId(Long userId) {
        return null;
    }

    @Override
    public List<ResponseDTO> getResponsesByResultId(Long resultId) {
        return null;
    }

    private ResponseDTO convertToDTO(Response response) {
        ResponseDTO responseDTO = new ResponseDTO();
        responseDTO.setId(response.getId());
        responseDTO.setQuestion(response.getQuestion());
        responseDTO.setAnswer(response.getResponseText());
        // responseDTO.setUserId(response.getUser().getId());
        responseDTO.setResultId(response.getResultId());
        return responseDTO;
    }



}
