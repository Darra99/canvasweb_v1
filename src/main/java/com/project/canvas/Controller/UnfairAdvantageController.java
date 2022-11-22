package com.project.canvas.Controller;

import com.project.canvas.Entity.UnfairAdvantage;
import com.project.canvas.Service.UnfairAdvantageService;
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
public class UnfairAdvantageController {

    @Autowired
    private UnfairAdvantageService unfairAdvantageService;


    //Listar
    @GetMapping("/unfairadvantage")
    public String unfairAdvantageList(Model model){
        model.addAttribute("unfairadvantage",unfairAdvantageService.unfairAdvantageListAll());
        return "unfairadvantage-templates/unfairadvantage";//Aquí nos va a retornar el archivo HTML principal del módulo
    }


    //
    @GetMapping("/unfairadvantage/create")
    public String unfairAdvantageShowFormCreate(Model model){
        UnfairAdvantage unfairAdvantage = new UnfairAdvantage();
        model.addAttribute("unfairadvantage",unfairAdvantage);
        return "unfairadvantage-templates/unfairadvantage_create";
    }


    //
    @PostMapping("/unfairadvantage")
    public String saveUnfairAdvantage(@Valid @ModelAttribute("unfairadvantage") UnfairAdvantage unfairAdvantage, BindingResult result, Model model, RedirectAttributes attributes){
        if(result.hasErrors()){
            model.addAttribute("unfairadvantage",unfairAdvantage);
            return "unfairadvantage-templates/unfairadvantage_create";
        }
        unfairAdvantageService.unfairAdvantageSave(unfairAdvantage);
        attributes.addFlashAttribute("success","¡Ventaja injusta guardado con éxito!");
        return "redirect:/unfairadvantage";
    }


    //
    @GetMapping("/unfairadvantage/edit/{id}")
    public String unfairAdvantageShowFormEdit(@PathVariable Long id, Model model){
        model.addAttribute("unfairadvantage", unfairAdvantageService.unfairAdvantageGetById(id));
        return "unfairadvantage-templates/unfairadvantage_edit";
    }


    //
    @PostMapping("/unfairadvantage/{id}")
    public String updateUnfairAdvantage(@PathVariable Long id, @ModelAttribute("unfairadvantage") UnfairAdvantage unfairAdvantage, Model model, RedirectAttributes attributes){
        UnfairAdvantage existingUnfairAdvantage = unfairAdvantageService.unfairAdvantageGetById(id);
        existingUnfairAdvantage.setIdUnfairAdvantage(id);
        existingUnfairAdvantage.setDescripcionUnfairAdvantage(unfairAdvantage.getDescripcionUnfairAdvantage());

        unfairAdvantageService.unfairAdvantageUpdate(existingUnfairAdvantage);
        attributes.addFlashAttribute("info","¡Ventaja injusta editado con éxito!");
        return "redirect:/unfairadvantage";
    }

    //
    @GetMapping("/unfairadvantage/{id}")
    public String removeUnfairAdvantage(@PathVariable Long id, RedirectAttributes attributes){
        unfairAdvantageService.unfairAdvantageRemove(id);
        attributes.addFlashAttribute("warning","¡Ventaja injusta eliminada con éxito!");
        return "redirect:/unfairadvantage";
    }


}
