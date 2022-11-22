package com.project.canvas.Controller;

import com.project.canvas.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @Autowired
    private BenefitsService benefitsService;
    @Autowired
    private BreakevenService breakevenService;
    @Autowired
    private CostsService costsService;
    @Autowired
    private ChannelsService channelsService;
    @Autowired
    private EarlyAdoptersService earlyAdoptersService;
    @Autowired
    private HighConceptService highConceptService;
    @Autowired
    private HowSolveProblemService howSolveProblemService;
    @Autowired
    private IncomeService incomeService;
    @Autowired
    private MetricsService metricsService;
    @Autowired
    private OdsSelectService odsSelectService;
    @Autowired
    private ProblemService problemService;
    @Autowired
    private SegmentService segmentService;
    @Autowired
    private SocialImpactService socialImpactService;
    @Autowired
    private SolutionService solutionService;
    @Autowired
    private UnfairAdvantageService unfairAdvantageService;
    @Autowired
    private UvpService uvpService;



    //Método principal del llamado de todas las tablas para llenar el canvas
    @GetMapping("index")
    public String canvasPage(Model model){
        model.addAttribute("benefits",benefitsService.benefitsListAll());
        model.addAttribute("breakeven",breakevenService.breakevenListAll());
        model.addAttribute("costs",costsService.costsListAll());
        model.addAttribute("channels",channelsService.channelsListAll());
        model.addAttribute("earlyadopters",earlyAdoptersService.earlyAdoptersListAll());
        model.addAttribute("highconcept",highConceptService.highConceptListAll());
        model.addAttribute("howsolveproblem",howSolveProblemService.howSolveProblemListAll());
        model.addAttribute("income",incomeService.incomeListAll());
        model.addAttribute("metrics",metricsService.metricsListAll());
        model.addAttribute("odsselect",odsSelectService.listAllOdsSelect());
        model.addAttribute("problem",problemService.problemListAll());
        model.addAttribute("segment",segmentService.segmentListAll());
        model.addAttribute("socialimpact",socialImpactService.socialImpactListAll());
        model.addAttribute("solution",solutionService.solutionListAll());
        model.addAttribute("unfairadvantage",unfairAdvantageService.unfairAdvantageListAll());
        model.addAttribute("uvp",uvpService.uvpListAll());

        model.addAttribute("index");
    return "index";
    }
















}
