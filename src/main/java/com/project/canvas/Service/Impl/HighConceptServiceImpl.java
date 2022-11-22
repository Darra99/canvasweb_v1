package com.project.canvas.Service.Impl;

import com.project.canvas.Entity.HighConcept;
import com.project.canvas.Repository.HighConceptRepository;
import com.project.canvas.Service.HighConceptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HighConceptServiceImpl implements HighConceptService {

    @Autowired
    public HighConceptRepository highConceptRepository;


    @Override
    public List<HighConcept> highConceptListAll() {
        return highConceptRepository.findAll();
    }

    @Override
    public HighConcept highConceptSave(HighConcept highConcept) {
        return highConceptRepository.save(highConcept);
    }

    @Override
    public HighConcept highConceptGetById(Long id) {
        return highConceptRepository.findById(id).get();
    }

    @Override
    public HighConcept highConceptUpdate(HighConcept highConcept) {
        return highConceptRepository.save(highConcept);
    }

    @Override
    public void highConceptRemove(Long id) {
        highConceptRepository.deleteById(id);
    }
}
