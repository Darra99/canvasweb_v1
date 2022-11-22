package com.project.canvas.Controller;

import com.project.canvas.Entity.SocialImpact;
import com.project.canvas.Service.SocialImpactService;
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
public class SocialImpactController {

    @Autowired
    private SocialImpactService socialImpactService;


    //Listar
    @GetMapping("/socialimpact")
    public String socialImpactList(Model model){
        model.addAttribute("socialimpact",socialImpactService.socialImpactListAll());
        return "socialimpact-templates/socialimpact";//Aquí nos va a retornar el archivo HTML principal del módulo
    }


    //
    @GetMapping("/socialimpact/create")
    public String socialImpactShowFormCreate(Model model){
        SocialImpact socialImpact = new SocialImpact();
        model.addAttribute("socialimpact",socialImpact);
        return "socialimpact-templates/socialimpact_create";
    }


    //
    @PostMapping("/socialimpact")
    public String saveSocialImpact(@Valid @ModelAttribute("socialimpact") SocialImpact socialImpact, BindingResult result, Model model, RedirectAttributes attributes){
        if(result.hasErrors()){
            model.addAttribute("socialimpact",socialImpact);
            return "socialimpact-templates/socialimpact_create";
        }
        socialImpactService.socialImpactSave(socialImpact);
        attributes.addFlashAttribute("success","¡Impacto social guardado con éxito!");
        return "redirect:/socialimpact";
    }


    //
    @GetMapping("/socialimpact/edit/{id}")
    public String socialImpactShowFormEdit(@PathVariable Long id, Model model){
        model.addAttribute("socialimpact", socialImpactService.socialImpactGetById(id));
        return "socialimpact-templates/socialimpact_edit";
    }


    //
    @PostMapping("/socialimpact/{id}")
    public String updateSocialImpact(@PathVariable Long id, @ModelAttribute("socialimpact") SocialImpact socialImpact, Model model, RedirectAttributes attributes){
        SocialImpact existingSocialImpact = socialImpactService.socialImpactGetById(id);
        existingSocialImpact.setIdSocialImpact(id);
        existingSocialImpact.setDescripcionSocialImpact(socialImpact.getDescripcionSocialImpact());

        socialImpactService.socialImpactUpdate(existingSocialImpact);
        attributes.addFlashAttribute("info","¡Impacto social editado con éxito!");
        return "redirect:/socialimpact";
    }

    //
    @GetMapping("/socialimpact/{id}")
    public String removeSocialImpact(@PathVariable Long id, RedirectAttributes attributes){
        socialImpactService.socialImpactRemove(id);
        attributes.addFlashAttribute("warning","¡Impacto social eliminado con éxito!");
        return "redirect:/socialimpact";
    }


}
