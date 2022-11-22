package com.project.canvas.Service;

import com.project.canvas.Entity.Benefits;

import java.util.List;

public interface BenefitsService {

    public List<Benefits> benefitsListAll();

    public Benefits benefitsSave(Benefits benefits);

    public Benefits benefitsGetById(Long id);

    public Benefits benefitsUpdate(Benefits benefits);

    public void benefitsRemove(Long id);


}
