package com.project.canvas.Controller;

import com.project.canvas.Entity.HowSolveProblem;
import com.project.canvas.Service.HowSolveProblemService;
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
public class HowSolveProblemController {

    @Autowired
    private HowSolveProblemService howSolveProblemService;


    //Listar
    @GetMapping("/howsolveproblem")
    public String howSolveProblemList(Model model){
        model.addAttribute("howsolveproblem",howSolveProblemService.howSolveProblemListAll());
        return "howsolveproblem-templates/howsolveproblem";//Aquí nos va a retornar el archivo HTML principal del módulo
    }


    //
    @GetMapping("/howsolveproblem/create")
    public String howSolveProblemShowFormCreate(Model model){
        HowSolveProblem howSolveProblem = new HowSolveProblem();
        model.addAttribute("howsolveproblem",howSolveProblem);
        return "howsolveproblem-templates/howsolveproblem_create";
    }


    //
    @PostMapping("/howsolveproblem")
    public String saveHowSolveProblem(@Valid @ModelAttribute("howsolveproblem") HowSolveProblem howSolveProblem, BindingResult result, Model model, RedirectAttributes attributes){
        if(result.hasErrors()){
            model.addAttribute("howsolveproblem",howSolveProblem);
            return "howsolveproblem-templates/howsolveproblem_create";
        }
        howSolveProblemService.howSolveProblemSave(howSolveProblem);
        attributes.addFlashAttribute("success","¡Encargado de resolver el problema guardado con éxito!");
        return "redirect:/howsolveproblem";
    }


    //
    @GetMapping("/howsolveproblem/edit/{id}")
    public String howSolveProblemShowFormEdit(@PathVariable Long id, Model model){
        model.addAttribute("howsolveproblem", howSolveProblemService.howSolveProblemGetById(id));
        return "howsolveproblem-templates/howsolveproblem_edit";
    }


    //
    @PostMapping("/howsolveproblem/{id}")
    public String updateHowSolveProblem(@PathVariable Long id, @ModelAttribute("howsolveproblem") HowSolveProblem howSolveProblem, Model model, RedirectAttributes attributes){
        HowSolveProblem existingHowSolveProblem = howSolveProblemService.howSolveProblemGetById(id);
        existingHowSolveProblem.setIdHowSolveProblem(id);
        existingHowSolveProblem.setDescripcionHowSolveProblem(howSolveProblem.getDescripcionHowSolveProblem());

        howSolveProblemService.howSolveProblemUpdate(existingHowSolveProblem);
        attributes.addFlashAttribute("info","¡Encargado de resolver el problema editado con éxito!");
        return "redirect:/howsolveproblem";
    }

    //
    @GetMapping("/howsolveproblem/{id}")
    public String removeHowSolveProblem(@PathVariable Long id, RedirectAttributes attributes){
        howSolveProblemService.howSolveProblemRemove(id);
        attributes.addFlashAttribute("warning","¡Encargado de resolver el problema eliminado con éxito!");
        return "redirect:/howsolveproblem";
    }


}
