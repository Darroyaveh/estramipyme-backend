package com.estramipyme.crud.service.interfaces;

import com.estramipyme.crud.dto.request.CreateResponseDTO;
import com.estramipyme.crud.dto.response.ResponseDTO;

import java.util.List;

public interface IResponseService {
    ResponseDTO createResponse(CreateResponseDTO createResponseDTO);
    List<ResponseDTO> getAllResponses();
    ResponseDTO getResponseById(Long id);
    void deleteResponse(Long id);
}
