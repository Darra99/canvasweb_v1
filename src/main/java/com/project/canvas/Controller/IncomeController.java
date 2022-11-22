package com.project.canvas.Controller;

import com.project.canvas.Entity.Income;
import com.project.canvas.Service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class IncomeController {

    @Autowired
    private IncomeService incomeService;


    //Listar
    @GetMapping("/income")
    public String incomeList(Model model){
        model.addAttribute("income",incomeService.incomeListAll());
        return "income-templates/income";//Aquí nos va a retornar el archivo HTML principal del módulo
    }


    //
    @GetMapping("/income/create")
    public String incomeShowFormCreate(Model model){
        Income income = new Income();
        model.addAttribute("income",income);
        return "income-templates/income_create";
    }


    //
    @PostMapping("/income")
    public String saveIncome(@Valid @ModelAttribute("income") Income income, BindingResult result, Model model, RedirectAttributes attributes){
        if(result.hasErrors()){
            model.addAttribute("income",income);
            return "income-templates/income_create";
        }
        incomeService.incomeSave(income);
        attributes.addFlashAttribute("success","¡Ingreso guardado con éxito!");
        return "redirect:/income";
    }


    //
    @GetMapping("/income/edit/{id}")
    public String incomeShowFormEdit(@PathVariable Long id, Model model){
        model.addAttribute("income", incomeService.incomeGetById(id));
        return "income-templates/income_edit";
    }


    //
    @PostMapping("/income/{id}")
    public String updateIncome(@PathVariable Long id, @ModelAttribute("income") Income income, Model model, RedirectAttributes attributes){
        Income existingIncome = incomeService.incomeGetById(id);
        existingIncome.setIdIncome(id);
        existingIncome.setDescripcionIncome(income.getDescripcionIncome());

        incomeService.incomeUpdate(existingIncome);
        attributes.addFlashAttribute("info","¡Ingreso editado con éxito!");
        return "redirect:/income";
    }

    //
    @GetMapping("/income/{id}")
    public String removeIncome(@PathVariable Long id, RedirectAttributes attributes){
        incomeService.incomeRemove(id);
        attributes.addFlashAttribute("warning","¡Ingreso eliminado con éxito!");
        return "redirect:/income";
    }


}
