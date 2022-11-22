package com.project.canvas.Service;

import com.project.canvas.Entity.HighConcept;

import java.util.List;

public interface HighConceptService {

    public List<HighConcept> highConceptListAll();

    public HighConcept highConceptSave(HighConcept highConcept);

    public HighConcept highConceptGetById(Long id);

    public HighConcept highConceptUpdate(HighConcept highConcept);

    public void highConceptRemove(Long id);


}
