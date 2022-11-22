package com.project.canvas.Controller;

import com.project.canvas.Entity.Benefits;
import com.project.canvas.Service.BenefitsService;
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
public class BenefitsController {

    @Autowired
    private BenefitsService benefitsService;


    //Listar
    @GetMapping("/benefits")
    public String benefitsList(Model model){
        model.addAttribute("benefits",benefitsService.benefitsListAll());
        return "benefits-templates/benefits";//Aquí nos va a retornar el archivo HTML principal del módulo
    }


    //
    @GetMapping("/benefits/create")
    public String benefitsShowFormCreate(Model model){
        Benefits benefits = new Benefits();
        model.addAttribute("benefits",benefits);
        return "benefits-templates/benefits_create";
    }


    //
    @PostMapping("/benefits")
    public String saveBenefits(@Valid @ModelAttribute("benefits") Benefits benefits, BindingResult result, Model model, RedirectAttributes attributes){
        if(result.hasErrors()){
            model.addAttribute("benefits",benefits);
            return "benefits-templates/benefits_create";
        }
        benefitsService.benefitsSave(benefits);
        attributes.addFlashAttribute("success","¡Beneficio guardado con éxito!");
        return "redirect:/benefits";
    }


    //
    @GetMapping("/benefits/edit/{id}")
    public String benefitsShowFormEdit(@PathVariable Long id, Model model) {
        model.addAttribute("benefits", benefitsService.benefitsGetById(id));
        return "benefits-templates/benefits_edit";
    }


    //
    @PostMapping("/benefits/{id}")
    public String updateBenefits(@PathVariable Long id, @ModelAttribute("benefits") Benefits benefits, Model model, RedirectAttributes attributes){
        Benefits existingBenefits = benefitsService.benefitsGetById(id);
        existingBenefits.setIdBenefits(id);
        existingBenefits.setDescripcionBenefits(benefits.getDescripcionBenefits());

        benefitsService.benefitsUpdate(existingBenefits);
        attributes.addFlashAttribute("info","¡Beneficio editado con éxito!");
        return "redirect:/benefits";
    }

    //
    @GetMapping("/benefits/{id}")
    public String removeBenefits(@PathVariable Long id, RedirectAttributes attributes){
        benefitsService.benefitsRemove(id);
        attributes.addFlashAttribute("warning","¡Beneficio eliminado con éxito!");
        return "redirect:/benefits";
    }


}
