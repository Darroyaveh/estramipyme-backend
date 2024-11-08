package com.estramipyme.crud.api.controllers;

import com.estramipyme.crud.dto.request.CreateOptionDTO;
import com.estramipyme.crud.dto.response.OptionDTO;
import com.estramipyme.crud.service.interfaces.IOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/options")
public class OptionController {

    @Autowired
    private IOptionService optionService;

    @PostMapping
    public ResponseEntity<OptionDTO> createOption(@Valid @RequestBody CreateOptionDTO createOptionDTO) {
        OptionDTO createdOption = optionService.createOption(createOptionDTO);
        return new ResponseEntity<>(createdOption, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OptionDTO> getOptionById(@PathVariable Long id) {
        OptionDTO option = optionService.getOptionById(id);
        return ResponseEntity.ok(option);
    }

    @GetMapping
    public ResponseEntity<List<OptionDTO>> getAllOptions() {
        List<OptionDTO> options = optionService.getAllOptions();
        return ResponseEntity.ok(options);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OptionDTO> updateOption(
            @PathVariable Long id,
            @Valid @RequestBody CreateOptionDTO createOptionDTO) {
        OptionDTO updatedOption = optionService.updateOption(id, createOptionDTO);
        return ResponseEntity.ok(updatedOption);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOption(@PathVariable Long id) {
        optionService.deleteOption(id);
        return ResponseEntity.noContent().build();
    }

}
