package com.project.canvas.Service;

import com.project.canvas.Entity.Income;

import java.util.List;

public interface IncomeService {

    public List<Income> incomeListAll();

    public Income incomeSave(Income income);

    public Income incomeGetById(Long id);

    public Income incomeUpdate(Income income);

    public void incomeRemove(Long id);


}
