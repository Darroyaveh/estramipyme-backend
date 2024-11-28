package com.estramipyme.crud.services;

import com.estramipyme.crud.models.Section;
import com.estramipyme.crud.repositories.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SectionService {

	@Autowired
	private SectionRepository sectionRepository;

	// Method to show all Sections
	public List<Section> showAllSections() {
		return sectionRepository.findAll();
	}

	// Method to create Section
	public Section createSection(Section section) {
		return sectionRepository.save(section);
	}

	// Method to get Section by id
	public Section getSectionById(String id) {
		Optional<Section> section = sectionRepository.findById(id);
		if (section.isPresent()) {
			return section.get();
		} else {
			throw new RuntimeException("Section not found with id: " + id);
		}
	}

	// Method to update Section
	public Section updateSection(Section section) {
		Optional<Section> existingSection = sectionRepository.findById(section.getId());

		if (existingSection.isPresent()) {
			Section updatedSection = existingSection.get();
			updatedSection.setValue(section.getValue());
			updatedSection.setOption(section.getOption());
			return sectionRepository.save(updatedSection);
		} else {
			throw new RuntimeException("Section not found with id: " + section.getId());
		}
	}

	// Method to delete Section
	public void deleteSection(String id) {
		Optional<Section> existingSection = sectionRepository.findById(id);

		if (existingSection.isPresent()) {
			sectionRepository.delete(existingSection.get());
		} else {
			throw new RuntimeException("Section not found with id: " + id);
		}
	}
}
