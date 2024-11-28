package com.estramipyme.crud.controllers;

import com.estramipyme.crud.models.Section;
import com.estramipyme.crud.services.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sections")
public class SectionController {

	@Autowired
	private SectionService sectionService;

	// Endpoint to get all sections
	@GetMapping
	public ResponseEntity<List<Section>> getAllSections() {
		List<Section> sections = sectionService.showAllSections();
		return ResponseEntity.ok(sections);
	}

	// Endpoint to create a section
	@PostMapping
	public ResponseEntity<Section> createSection(@RequestBody Section section) {
		Section createdSection = sectionService.createSection(section);
		return ResponseEntity.status(201).body(createdSection);
	}

	// Endpoint to get a section by id
	@GetMapping("/{id}")
	public ResponseEntity<Section> getSectionById(@PathVariable String id) {
		Section section = sectionService.getSectionById(id);
		return ResponseEntity.ok(section);
	}

	// Endpoint to update a section
	@PutMapping("/{id}")
	public ResponseEntity<Section> updateSection(@PathVariable String id, @RequestBody Section sectionDetails) {
		sectionDetails.setId(id);
		Section updatedSection = sectionService.updateSection(sectionDetails);
		return ResponseEntity.ok(updatedSection);
	}

	// Endpoint to delete a section
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteSection(@PathVariable String id) {
		sectionService.deleteSection(id);
		return ResponseEntity.noContent().build();
	}
}
