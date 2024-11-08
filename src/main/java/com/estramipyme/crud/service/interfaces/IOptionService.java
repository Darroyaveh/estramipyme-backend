package com.estramipyme.crud.service.interfaces;

import com.estramipyme.crud.dto.request.CreateOptionDTO;
import com.estramipyme.crud.dto.response.OptionDTO;

import java.util.List;

public interface IOptionService {
    OptionDTO createOption(CreateOptionDTO createOptionDTO);
    OptionDTO getOptionById(Long id);
    List<OptionDTO> getAllOptions();
    OptionDTO updateOption(Long id, CreateOptionDTO createOptionDTO);
    void deleteOption(Long id);
}