package com.project.canvas.Controller;

import com.project.canvas.Entity.Costs;
import com.project.canvas.Service.CostsService;
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
public class CostsController {

    @Autowired
    private CostsService costsService;


    //Listar
    @GetMapping("/costs")
    public String costsList(Model model){
        model.addAttribute("costs",costsService.costsListAll());
        return "costs-templates/costs";//Aquí nos va a retornar el archivo HTML principal del módulo
    }


    //
    @GetMapping("/costs/create")
    public String costsShowFormCreate(Model model){
        Costs costs = new Costs();
        model.addAttribute("costs",costs);
        return "costs-templates/costs_create";
    }


    //
    @PostMapping("/costs")
    public String saveCosts(@Valid @ModelAttribute("costs") Costs costs, BindingResult result, Model model, RedirectAttributes attributes){
        if(result.hasErrors()) {
            model.addAttribute("costs",costs);
            return "costs-templates/costs_create";
        }
        costsService.costsSave(costs);
        attributes.addFlashAttribute("success","¡Costo guardado con éxito!");
        return "redirect:/costs";
    }


    //
    @GetMapping("/costs/edit/{id}")
    public String costsShowFormEdit(@PathVariable Long id, Model model){
        model.addAttribute("costs", costsService.costsGetById(id));
        return "costs-templates/costs_edit";
    }


    //
    @PostMapping("/costs/{id}")
    public String updateCosts(@PathVariable Long id, @ModelAttribute("costs") Costs costs, Model model, RedirectAttributes attributes){
        Costs existingCosts = costsService.costsGetById(id);
        existingCosts.setIdCosts(id);
        existingCosts.setDescripcionCosts(costs.getDescripcionCosts());

        costsService.costsUpdate(existingCosts);
        attributes.addFlashAttribute("info","¡Costo editado con éxito!");
        return "redirect:/costs";
    }

    //
    @GetMapping("/costs/{id}")
    public String removeCosts(@PathVariable Long id, RedirectAttributes attributes){
        costsService.costsRemove(id);
        attributes.addFlashAttribute("warning","¡Costo eliminado con éxito!");
        return "redirect:/costs";
    }


}
