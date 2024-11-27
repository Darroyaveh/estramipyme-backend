package com.estramipyme.crud.controllers;

import com.estramipyme.crud.models.Form;
import com.estramipyme.crud.services.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/forms")
public class FormController {

//	@Autowired
//	private FormService formService;
//
//	@GetMapping
//	public List<Form> getAllForms() {
//		return formService.showAllForms();
//	}
//
//	@GetMapping("/{id}")
//	public Form getFormById(@PathVariable String id) {
//		return formService.getFormById(id);
//	}
//
//	@PostMapping
//	public Form createForm(@RequestBody Form form) {
//		return formService.createForm(form);
//	}
//
//	@PutMapping
//	public Form updateForm(@RequestBody Form form) {
//		return formService.updateForm(form);
//	}
//
//	@DeleteMapping("/{id}")
//	public void deleteForm(@PathVariable String id) {
//		formService.deleteForm(id);
//	}
}