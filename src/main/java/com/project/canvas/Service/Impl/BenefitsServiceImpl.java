package com.project.canvas.Service.Impl;

import com.project.canvas.Entity.Benefits;
import com.project.canvas.Repository.BenefitsRepository;
import com.project.canvas.Service.BenefitsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BenefitsServiceImpl implements BenefitsService {

    @Autowired
    public BenefitsRepository benefitsRepository;


    @Override
    public List<Benefits> benefitsListAll() {
        return benefitsRepository.findAll();
    }

    @Override
    public Benefits benefitsSave(Benefits benefits) {
        return benefitsRepository.save(benefits);
    }

    @Override
    public Benefits benefitsGetById(Long id) {
        return benefitsRepository.findById(id).get();
    }

    @Override
    public Benefits benefitsUpdate(Benefits benefits) {
        return benefitsRepository.save(benefits);
    }

    @Override
    public void benefitsRemove(Long id) {
        benefitsRepository.deleteById(id);
    }
}
