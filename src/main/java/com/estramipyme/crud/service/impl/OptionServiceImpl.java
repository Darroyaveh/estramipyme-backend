package com.estramipyme.crud.service.impl;

import com.estramipyme.crud.dto.request.CreateOptionDTO;
import com.estramipyme.crud.dto.response.OptionDTO;
import com.estramipyme.crud.persistence.entities.Option;
import com.estramipyme.crud.persistence.repositories.OptionRepository;
import com.estramipyme.crud.service.interfaces.IOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OptionServiceImpl implements IOptionService {

    @Autowired
    private OptionRepository optionRepository;

    @Override
    public OptionDTO createOption(CreateOptionDTO createOptionDTO) {
        Option option = new Option();
        option.setQuestionId(createOptionDTO.getQuestionId());
        option.setOptionText(createOptionDTO.getOptionText());
        Option savedOption = optionRepository.save(option);
        return convertToDTO(savedOption);
    }

    @Override
    public OptionDTO getOptionById(Long id) {
        Option option = optionRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Option not found"));
        return convertToDTO(option);
    }

    @Override
    public List<OptionDTO> getAllOptions() {
        return optionRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    @Override
    public OptionDTO updateOption(Long id, CreateOptionDTO createOptionDTO) {
        Option option = optionRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Option not found"));
        option.setQuestionId(createOptionDTO.getQuestionId());
        option.setOptionText(createOptionDTO.getOptionText());
        Option updatedOption = optionRepository.save(option);
        return convertToDTO(updatedOption);
    }

    @Override
    public void deleteOption(Long id) {
        Option option = optionRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Option not found"));
        optionRepository.delete(option);
    }

    private OptionDTO convertToDTO(Option option) {
        OptionDTO dto = new OptionDTO();
        dto.setId(option.getId());
        dto.setQuestionId(option.getQuestionId());
        dto.setOptionText(option.getOptionText());
        return dto;
    }
}