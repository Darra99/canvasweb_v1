package com.project.canvas.Controller;

import com.project.canvas.Entity.Ods;
import com.project.canvas.Entity.OdsSelect;
import com.project.canvas.Service.OdsSelectService;
import com.project.canvas.Service.OdsService;
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
import java.util.List;

@Controller
public class OdsSelectController {

    @Autowired
    private OdsSelectService odsSelectService;

    @Autowired
    private OdsService odsService;


    @GetMapping("/ods")
    public String listAllOdsSelect(Model model){
        model.addAttribute("odsselect",odsSelectService.listAllOdsSelect());
        return "ods-templates/odslist";
    }

    @GetMapping("/ods/create")
    public String createOdsSelectForm( Model model){

        OdsSelect odsSelect = new OdsSelect();
        List<Ods> listOds = odsService.listAllOds();

        model.addAttribute("odsselect",odsSelect);
        model.addAttribute("ods",listOds);

        return "ods-templates/odsselect";
    }

    @PostMapping("/ods")
    public String createOdsSelect(@Valid @ModelAttribute OdsSelect odsSelect, BindingResult result, Model model, RedirectAttributes attributes){
        if(result.hasErrors()){
            List<Ods> listOds = odsService.listAllOds();

            model.addAttribute("odsselect",odsSelect);
            model.addAttribute("ods",listOds);

            return "ods-templates/odsselect";
        }
        odsSelectService.saveOdsSelect(odsSelect);
        attributes.addFlashAttribute("success","¡ODS guardado con éxito!");
        return "redirect:/ods";
    }


    @GetMapping("/ods/edit/{id}")
    public String editOdsSelectForm(@PathVariable("id") Long idOdsSelect, Model model, RedirectAttributes attributes){

        OdsSelect odsSelect = odsSelectService.searchXId(idOdsSelect);
        List<Ods> listOds = odsService.listAllOds();

        model.addAttribute("odsselect",odsSelect);
        model.addAttribute("ods",listOds);
        attributes.addFlashAttribute("info","¡ODS editado con éxito!");
        return "ods-templates/odsselect";
    }

    @GetMapping("/ods/delete/{id}")
    public String deleteOdsSelectForm(@PathVariable("id") Long idOdsSelect, Model model, RedirectAttributes attributes){
        odsSelectService.eliminar(idOdsSelect);
        attributes.addFlashAttribute("warning","¡ODS eliminado con éxito!");
        return "redirect:/ods";
    }

}
