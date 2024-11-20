package com.estramipyme.crud.service.impl;

import com.estramipyme.crud.dto.request.CreateResponseDTO;
import com.estramipyme.crud.dto.response.ResponseDTO;
import com.estramipyme.crud.persistence.entities.Response;
import com.estramipyme.crud.persistence.repositories.ResponseRepository;
import com.estramipyme.crud.service.interfaces.IResponseService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ResponseServiceImpl implements IResponseService {

    private final ResponseRepository responseRepository;
    private final ModelMapper modelMapper;

    @Override
    public ResponseDTO createResponse(CreateResponseDTO createResponseDTO) {
        Response response = modelMapper.map(createResponseDTO, Response.class);
        response = responseRepository.save(response);
        return modelMapper.map(response, ResponseDTO.class);
    }

    @Override
    public List<ResponseDTO> getAllResponses() {
        return responseRepository.findAll().stream()
                .map(response -> modelMapper.map(response, ResponseDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public ResponseDTO getResponseById(Long id) {
        Response response = responseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Response not found"));
        return modelMapper.map(response, ResponseDTO.class);
    }

    @Override
    public void deleteResponse(Long id) {
        responseRepository.deleteById(id);
    }
}
