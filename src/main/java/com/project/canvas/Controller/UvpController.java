package com.project.canvas.Controller;

import com.project.canvas.Entity.Uvp;
import com.project.canvas.Service.UvpService;
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
public class UvpController {

    @Autowired
    private UvpService uvpService;


    //Listar
    @GetMapping("/uvp")
    public String uvpList(Model model){
        model.addAttribute("uvp",uvpService.uvpListAll());
        return "/uvp-templates/uvp";//Aquí nos va a retornar el archivo HTML principal del módulo
    }


    //
    @GetMapping("/uvp/create")
    public String uvpShowFormCreate(Model model){
        Uvp uvp = new Uvp();
        model.addAttribute("uvp",uvp);
        return "/uvp-templates/uvp_create";
    }


    //
    @PostMapping("/uvp")
    public String saveUvp(@Valid @ModelAttribute("uvp") Uvp uvp, BindingResult result, Model model, RedirectAttributes attributes){
        if(result.hasErrors()){
            model.addAttribute("uvp",uvp);
            return "/uvp-templates/uvp_create";
        }
        uvpService.uvpSave(uvp);
        attributes.addFlashAttribute("success","¡UVP guardado con éxito!");
        return "redirect:/uvp";
    }


    //
    @GetMapping("/uvp/edit/{id}")
    public String uvpShowFormEdit(@PathVariable Long id, Model model){
        model.addAttribute("uvp", uvpService.uvpGetById(id));
        return "/uvp-templates/uvp_edit";
    }


    //
    @PostMapping("/uvp/{id}")
    public String updateUvp(@PathVariable Long id, @ModelAttribute("uvp") Uvp uvp, Model model, RedirectAttributes attributes){
        Uvp existingUvp = uvpService.uvpGetById(id);
        existingUvp.setIdUvp(id);
        existingUvp.setDescripcionUvp(uvp.getDescripcionUvp());

        uvpService.uvpUpdate(existingUvp);
        attributes.addFlashAttribute("info","¡UVP editado con éxito!");
        return "redirect:/uvp";
    }

    //
    @GetMapping("/uvp/{id}")
    public String removeUvp(@PathVariable Long id, RedirectAttributes attributes){
        uvpService.uvpRemove(id);
        attributes.addFlashAttribute("warning","¡UVP eliminado con éxito!");
        return "redirect:/uvp";
    }


}
