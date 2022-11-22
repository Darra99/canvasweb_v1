package com.project.canvas.Controller;

import com.project.canvas.Entity.Problem;
import com.project.canvas.Service.ProblemService;
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
public class ProblemController {

    @Autowired
    private ProblemService problemService;


    //Listar
    @GetMapping("/problem")
    public String problemList(Model model){
        model.addAttribute("problem",problemService.problemListAll());
        return "problem-templates/problem";//Aquí nos va a retornar el archivo HTML principal del módulo
    }


    //
    @GetMapping("/problem/create")
    public String problemShowFormCreate(Model model){
        Problem problem = new Problem();
        model.addAttribute("problem",problem);
        return "problem-templates/problem_create";
    }


    //
    @PostMapping("/problem")
    public String saveProblem(@Valid @ModelAttribute("problem") Problem problem, BindingResult result, Model model, RedirectAttributes attributes){
        if(result.hasErrors()){
            model.addAttribute("problem",problem);
            return "problem-templates/problem_create";
        }
        problemService.problemSave(problem);
        attributes.addFlashAttribute("success","¡Problema guardado con éxito!");
        return "redirect:/problem";
    }


    //
    @GetMapping("/problem/edit/{id}")
    public String problemShowFormEdit(@PathVariable Long id, Model model){
        model.addAttribute("problem", problemService.problemGetById(id));
        return "problem-templates/problem_edit";
    }


    //
    @PostMapping("/problem/{id}")
    public String updateProblem(@PathVariable Long id, @ModelAttribute("problem") Problem problem, Model model, RedirectAttributes attributes){
        Problem existingProblem = problemService.problemGetById(id);
        existingProblem.setIdProblemOpportunity(id);
        existingProblem.setDescripcionProblemOpportunity(problem.getDescripcionProblemOpportunity());

        problemService.problemUpdate(existingProblem);
        attributes.addFlashAttribute("info","¡Problema editado con éxito!");
        return "redirect:/problem";
    }

    //
    @GetMapping("/problem/{id}")
    public String removeProblem(@PathVariable Long id, RedirectAttributes attributes){
        problemService.problemRemove(id);
        attributes.addFlashAttribute("warning","¡Problema eliminado con éxito!");
        return "redirect:/problem";
    }


}
