package com.project.canvas.Controller;

import com.project.canvas.Entity.HighConcept;
import com.project.canvas.Service.HighConceptService;
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
public class HighConceptController {

    @Autowired
    private HighConceptService highConceptService;


    //Listar
    @GetMapping("/highconcept")
    public String highConceptList(Model model){
        model.addAttribute("highconcept",highConceptService.highConceptListAll());
        return "highconcept-templates/highconcept";//Aquí nos va a retornar el archivo HTML principal del módulo
    }


    //
    @GetMapping("/highconcept/create")
    public String highConceptShowFormCreate(Model model){
        HighConcept highConcept = new HighConcept();
        model.addAttribute("highconcept",highConcept);
        return "highconcept-templates/highconcept_create";
    }


    //
    @PostMapping("/highconcept")
    public String saveHighConcept(@Valid @ModelAttribute("highconcept") HighConcept highConcept, BindingResult result, Model model, RedirectAttributes attributes){
        if(result.hasErrors()){
            model.addAttribute("highconcept",highConcept);
            return "highconcept-templates/highconcept_create";
        }
        highConceptService.highConceptSave(highConcept);
        attributes.addFlashAttribute("success","¡High Concept guardado con éxito!");
        return "redirect:/highconcept";
    }


    //
    @GetMapping("/highconcept/edit/{id}")
    public String highConceptShowFormEdit(@PathVariable Long id, Model model){
        model.addAttribute("highconcept", highConceptService.highConceptGetById(id));
        return "highconcept-templates/highconcept_edit";
    }


    //
    @PostMapping("/highconcept/{id}")
    public String updateHighConcept(@PathVariable Long id, @ModelAttribute("highconcept") HighConcept highConcept, Model model, RedirectAttributes attributes){
        HighConcept existingHighConcept = highConceptService.highConceptGetById(id);
        existingHighConcept.setIdHightConcept(id);
        existingHighConcept.setDescripcionHightConcept(highConcept.getDescripcionHightConcept());

        highConceptService.highConceptUpdate(existingHighConcept);
        attributes.addFlashAttribute("info","¡High Concept editado con éxito!");
        return "redirect:/highconcept";
    }

    //
    @GetMapping("/highconcept/{id}")
    public String removeHighConcept(@PathVariable Long id, RedirectAttributes attributes){
        highConceptService.highConceptRemove(id);
        attributes.addFlashAttribute("warning","¡High Concept eliminado con éxito!");
        return "redirect:/highconcept";
    }


}
