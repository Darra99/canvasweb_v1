package com.project.canvas.Controller;

import com.project.canvas.Entity.EarlyAdopters;
import com.project.canvas.Service.EarlyAdoptersService;
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
public class EarlyAdoptersController {

    @Autowired
    private EarlyAdoptersService earlyAdoptersService;


    //Listar
    @GetMapping("/earlyadopters")
    public String earlyAdoptersList(Model model){
        model.addAttribute("earlyadopters",earlyAdoptersService.earlyAdoptersListAll());
        return "earlyadopters-templates/earlyadopters";//Aquí nos va a retornar el archivo HTML principal del módulo
    }


    //
    @GetMapping("/earlyadopters/create")
    public String earlyAdoptersShowFormCreate(Model model){
        EarlyAdopters earlyAdopters = new EarlyAdopters();
        model.addAttribute("earlyadopters",earlyAdopters);
        return "earlyadopters-templates/earlyadopters_create";
    }


    //
    @PostMapping("/earlyadopters")
    public String saveEarlyAdopters(@Valid @ModelAttribute("earlyadopters") EarlyAdopters earlyAdopters, BindingResult result, Model model, RedirectAttributes attributes){
        if(result.hasErrors()) {
            model.addAttribute("earlyadopters",earlyAdopters);
            return "earlyadopters-templates/earlyadopters_create";
        }
        earlyAdoptersService.earlyAdoptersSave(earlyAdopters);
        attributes.addFlashAttribute("success","¡Early Adopter guardado con éxito!");
        return "redirect:/earlyadopters";
    }


    //
    @GetMapping("/earlyadopters/edit/{id}")
    public String earlyAdoptersShowFormEdit(@PathVariable Long id, Model model){
        model.addAttribute("earlyadopters", earlyAdoptersService.earlyAdoptersGetById(id));
        return "earlyadopters-templates/earlyadopters_edit";
    }


    //
    @PostMapping("/earlyadopters/{id}")
    public String updateEarlyAdopters(@PathVariable Long id, @ModelAttribute("earlyadopters") EarlyAdopters earlyAdopters, Model model, RedirectAttributes attributes){
        EarlyAdopters existingEarlyAdopters = earlyAdoptersService.earlyAdoptersGetById(id);
        existingEarlyAdopters.setIdEarlyAdopters(id);
        existingEarlyAdopters.setDescripcionEarlyAdopters(earlyAdopters.getDescripcionEarlyAdopters());

        earlyAdoptersService.earlyAdoptersUpdate(existingEarlyAdopters);
        attributes.addFlashAttribute("info","¡Early Adopter editado con éxito!");
        return "redirect:/earlyadopters";
    }

    //
    @GetMapping("/earlyadopters/{id}")
    public String removeEarlyAdopters(@PathVariable Long id, RedirectAttributes attributes){
        earlyAdoptersService.earlyAdoptersRemove(id);
        attributes.addFlashAttribute("warning","¡Early Adopter eliminado con éxito!");
        return "redirect:/earlyadopters";
    }


}
