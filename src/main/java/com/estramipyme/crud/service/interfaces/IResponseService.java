package com.estramipyme.crud.service.interfaces;

import java.util.List;

import com.estramipyme.crud.dto.request.CreateResponseDTO;
import com.estramipyme.crud.dto.response.ResponseDTO;

public interface IResponseService {
    ResponseDTO createResponse(CreateResponseDTO createResponseDTO);
    ResponseDTO getResponseById(Long id);
    List<ResponseDTO> getResponsesByUserId(Long userId);
    List<ResponseDTO> getResponsesByResultId(Long resultId);
}
