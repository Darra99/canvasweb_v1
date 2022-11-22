package com.project.canvas.Service.Impl;

import com.project.canvas.Entity.Income;
import com.project.canvas.Repository.IncomeRepository;
import com.project.canvas.Service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IncomeServiceImpl implements IncomeService {

    @Autowired
    public IncomeRepository incomeRepository;


    @Override
    public List<Income> incomeListAll() {
        return incomeRepository.findAll();
    }

    @Override
    public Income incomeSave(Income income) {
        return incomeRepository.save(income);
    }

    @Override
    public Income incomeGetById(Long id) {
        return incomeRepository.findById(id).get();
    }

    @Override
    public Income incomeUpdate(Income income) {
        return incomeRepository.save(income);
    }

    @Override
    public void incomeRemove(Long id) {
        incomeRepository.deleteById(id);
    }
}
