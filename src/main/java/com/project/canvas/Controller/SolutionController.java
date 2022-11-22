package com.project.canvas.Controller;

import com.project.canvas.Entity.Solution;
import com.project.canvas.Service.SolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class SolutionController {

    @Autowired
    private SolutionService solutionService;


    //Listar
    @GetMapping("/solution")
    public String solutionList(Model model){
        model.addAttribute("solution",solutionService.solutionListAll());
        return "solution-templates/solution";//Aquí nos va a retornar el archivo HTML principal del módulo
    }


    //
    @GetMapping("/solution/create")
    public String solutionShowFormCreate(Model model){
        Solution solution = new Solution();
        model.addAttribute("solution",solution);
        return "solution-templates/solution_create";
    }


    //
    @PostMapping("/solution")
    public String saveSolution(@Valid @ModelAttribute("solution") Solution solution, BindingResult result, Model model, RedirectAttributes attributes){
        if(result.hasErrors()){
            model.addAttribute("solution",solution);
            return "solution-templates/solution_create";
        }
        solutionService.solutionSave(solution);
        attributes.addFlashAttribute("success","¡Solución guardado con éxito!");
        return "redirect:/solution";
    }


    //
    @GetMapping("/solution/edit/{id}")
    public String solutionShowFormEdit(@PathVariable Long id, Model model){
        model.addAttribute("solution", solutionService.solutionGetById(id));
        return "solution-templates/solution_edit";
    }


    //
    @PostMapping("/solution/{id}")
    public String updateSolution(@PathVariable Long id, @ModelAttribute("solution") Solution solution, Model model,  RedirectAttributes attributes){
        Solution existingSolution = solutionService.solutionGetById(id);
        existingSolution.setIdSolution(id);
        existingSolution.setDescripcionSolution(solution.getDescripcionSolution());

        solutionService.solutionUpdate(existingSolution);
        attributes.addFlashAttribute("info","¡Solución editado con éxito!");
        return "redirect:/solution";
    }

    //
    @GetMapping("/solution/{id}")
    public String removeSolution(@PathVariable Long id, RedirectAttributes attributes){
        solutionService.solutionRemove(id);
        attributes.addFlashAttribute("warning","¡Solución eliminado con éxito!");
        return "redirect:/solution";
    }


}
