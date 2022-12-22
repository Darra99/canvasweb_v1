package com.project.canvas.Controller;

import com.project.canvas.Entity.Ods;
import com.project.canvas.Entity.OdsSave;
import com.project.canvas.Entity.OdsSelect;
import com.project.canvas.Service.OdsSaveService;
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
    private OdsSaveService odsSaveService;

    @Autowired
    private OdsSelectService odsSelectService;

    @Autowired
    private OdsService odsService;



    @GetMapping("/ods")
    public String listAllOdsSelect(Model model){
        model.addAttribute("odssave",odsSaveService.listAllOdsSave());
        return "ods-templates/odslist";
    }

    @GetMapping("/ods/create")
    public String createOdsSelectForm( Model model){

        OdsSave odsSave = new OdsSave();
        List<OdsSelect> listOdsSelect = odsSelectService.listAllOdsSelect();
        List<Ods> listOds = odsService.listAllOds();

        model.addAttribute("odssave",odsSave);
        model.addAttribute("odsselect",listOdsSelect);
        model.addAttribute("ods",listOds);

        return "ods-templates/odsselect";
    }

    @PostMapping("/ods")
    public String createOdsSelect(@Valid @ModelAttribute OdsSave odsSave, BindingResult result, Model model, RedirectAttributes attributes){
        if(result.hasErrors()){
            List<Ods> listOds = odsService.listAllOds();
            List<OdsSelect> listOdsSelect = odsSelectService.listAllOdsSelect();


            model.addAttribute("odssave",odsSave);
            model.addAttribute("ods",listOds);
            model.addAttribute("odsselect",listOdsSelect);


            return "ods-templates/odsselect";
        }
        odsSaveService.saveOdsSave(odsSave);
        attributes.addFlashAttribute("success","¡ODS guardado con éxito!");
        return "redirect:/ods";
    }


    @GetMapping("/ods/edit/{id}")
    public String editOdsSelectForm(@PathVariable("id") Long idOdsSave, Model model, RedirectAttributes attributes){

        OdsSave odsSave = odsSaveService.searchXId(idOdsSave);
        List<Ods> listOds = odsService.listAllOds();
        List<OdsSelect> listOdsSelect = odsSelectService.listAllOdsSelect();


        model.addAttribute("odssave",odsSave);
        model.addAttribute("ods",listOds);
        model.addAttribute("odsselect",listOdsSelect);
        attributes.addFlashAttribute("info","¡ODS editado con éxito!");
        return "ods-templates/odsselect";
    }

    @GetMapping("/ods/delete/{id}")
    public String deleteOdsSelectForm(@PathVariable("id") Long idOdsSave, Model model, RedirectAttributes attributes){
        odsSaveService.eliminar(idOdsSave);
        attributes.addFlashAttribute("warning","¡ODS eliminado con éxito!");
        return "redirect:/ods";
    }

}
