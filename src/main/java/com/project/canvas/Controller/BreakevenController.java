package com.project.canvas.Controller;


import com.project.canvas.Entity.Breakeven;
import com.project.canvas.Service.BreakevenService;
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
public class BreakevenController {

    @Autowired
    private BreakevenService breakevenService;


    //Listar
    @GetMapping("/breakeven")
    public String breakevenList(Model model){
        model.addAttribute("breakeven",breakevenService.breakevenListAll());
        return "/breakeven-templates/breakeven";//Aquí nos va a retornar el archivo HTML principal del módulo
    }


    //
    @GetMapping("/breakeven/create")
    public String breakevenShowFormCreate(Model model){
        Breakeven breakeven = new Breakeven();
        model.addAttribute("breakeven",breakeven);
        return "/breakeven-templates/breakeven_create";
    }


    //
    @PostMapping("/breakeven")
    public String saveBreakeven(@Valid @ModelAttribute("breakeven") Breakeven breakeven, BindingResult result, Model model, RedirectAttributes attributes){
        if(result.hasErrors()) {
            model.addAttribute("breakeven",breakeven);
            return "/breakeven-templates/breakeven_create";
        }
        breakevenService.breakevenSave(breakeven);
        attributes.addFlashAttribute("success","¡Punto de equilibrio guardado con éxito!");
        return "redirect:/breakeven";
    }


    //
    @GetMapping("/breakeven/edit/{id}")
    public String breakevenShowFormEdit(@PathVariable Long id, Model model){
        model.addAttribute("breakeven", breakevenService.breakevenGetById(id));
        return "/breakeven-templates/breakeven_edit";
    }


    //
    @PostMapping("/breakeven/{id}")
    public String updateBreakeven(@PathVariable Long id, @ModelAttribute("breakeven") Breakeven breakeven, Model model, RedirectAttributes attributes){
        Breakeven existingBreakeven = breakevenService.breakevenGetById(id);
        existingBreakeven.setIdBreakeven(id);
        existingBreakeven.setDescripcionBreakeven(breakeven.getDescripcionBreakeven());

        breakevenService.breakevenUpdate(existingBreakeven);
        attributes.addFlashAttribute("info","¡Punto de equilibrio editado con éxito!");
        return "redirect:/breakeven";
    }

    //
    @GetMapping("/breakeven/{id}")
    public String removeBreakeven(@PathVariable Long id, RedirectAttributes attributes){
        breakevenService.breakevenRemove(id);
        attributes.addFlashAttribute("warning","¡Punto de equilibrio eliminado con éxito!");
        return "redirect:/breakeven";
    }


}
