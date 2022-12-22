package com.project.canvas.Controller;

import com.project.canvas.Service.ProblemService;
import com.project.canvas.Service.SegmentService;
import com.project.canvas.Service.SolutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FilterController {


    @Autowired
    private ProblemService problemService;

    @Autowired
    private SegmentService segmentService;

    @Autowired
    private SolutionService solutionService;


    @GetMapping("filter")
    public String filterPage(Model model){

        model.addAttribute("problem",problemService.problemListAll());
        model.addAttribute("segment",segmentService.segmentListAll());
        model.addAttribute("solution",solutionService.solutionListAll());

        model.addAttribute("filter");

        return "filterpage-templates/filter";
    }

}
