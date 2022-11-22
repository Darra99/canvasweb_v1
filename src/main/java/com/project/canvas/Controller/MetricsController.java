package com.project.canvas.Controller;

import com.project.canvas.Entity.Metrics;
import com.project.canvas.Service.MetricsService;
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
public class MetricsController {

    @Autowired
    private MetricsService metricsService;


    //Listar
    @GetMapping("/metrics")
    public String metricsList(Model model){
        model.addAttribute("metrics",metricsService.metricsListAll());
        return "metrics-templates/metrics";//Aquí nos va a retornar el archivo HTML principal del módulo
    }


    //
    @GetMapping("/metrics/create")
    public String metricsShowFormCreate(Model model){
        Metrics metrics = new Metrics();
        model.addAttribute("metrics",metrics);
        return "metrics-templates/metrics_create";
    }


    //
    @PostMapping("/metrics")
    public String saveMetrics(@Valid @ModelAttribute("metrics") Metrics metrics, BindingResult result, Model model, RedirectAttributes attributes){
        if(result.hasErrors()){
            model.addAttribute("metrics",metrics);
            return "metrics-templates/metrics_create";
        }
        metricsService.metricsSave(metrics);
        attributes.addFlashAttribute("success","¡Métrica guardada con éxito!");
        return "redirect:/metrics";
    }


    //
    @GetMapping("/metrics/edit/{id}")
    public String metricsShowFormEdit(@PathVariable Long id, Model model){
        model.addAttribute("metrics", metricsService.metricsGetById(id));
        return "metrics-templates/metrics_edit";
    }


    //
    @PostMapping("/metrics/{id}")
    public String updateMetrics(@PathVariable Long id, @ModelAttribute("metrics") Metrics metrics, Model model, RedirectAttributes attributes){
        Metrics existingMetrics = metricsService.metricsGetById(id);
        existingMetrics.setIdMetrics(id);
        existingMetrics.setDescripcionMetrics(metrics.getDescripcionMetrics());

        metricsService.metricsUpdate(existingMetrics);
        attributes.addFlashAttribute("info","¡Métrica editada con éxito!");
        return "redirect:/metrics";
    }

    //
    @GetMapping("/metrics/{id}")
    public String removeMetrics(@PathVariable Long id, RedirectAttributes attributes){
        metricsService.metricsRemove(id);
        attributes.addFlashAttribute("warning","¡Métrica eliminada con éxito!");
        return "redirect:/metrics";
    }


}
