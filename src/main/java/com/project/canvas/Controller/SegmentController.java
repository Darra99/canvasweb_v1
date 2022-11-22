package com.project.canvas.Controller;

import com.project.canvas.Entity.Segment;
import com.project.canvas.Service.SegmentService;
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
public class SegmentController {

    @Autowired
    private SegmentService segmentService;


    //Listar
    @GetMapping("/segment")
    public String segmentList(Model model){
        model.addAttribute("segment",segmentService.segmentListAll());
        return "segment-templates/segment";//Aquí nos va a retornar el archivo HTML principal del módulo
    }


    //
    @GetMapping("/segment/create")
    public String segmentShowFormCreate(Model model){
        Segment segment = new Segment();
        model.addAttribute("segment",segment);
        return "segment-templates/segment_create";
    }


    //
    @PostMapping("/segment")
    public String saveSegment(@Valid @ModelAttribute("segment") Segment segment, BindingResult result, Model model, RedirectAttributes attributes){
        if(result.hasErrors()){
            model.addAttribute("segment",segment);
            return "segment-templates/segment_create";
        }
        segmentService.segmentSave(segment);
        attributes.addFlashAttribute("success","¡Segmento guardado con éxito!");
        return "redirect:/segment";
    }


    //
    @GetMapping("/segment/edit/{id}")
    public String segmentShowFormEdit(@PathVariable Long id, Model model){
        model.addAttribute("segment", segmentService.segmentGetById(id));
        return "segment-templates/segment_edit";
    }


    //
    @PostMapping("/segment/{id}")
    public String updateSegment(@PathVariable Long id, @ModelAttribute("segment") Segment segment, Model model, RedirectAttributes attributes){
        Segment existingSegment = segmentService.segmentGetById(id);
        existingSegment.setIdSegment(id);
        existingSegment.setDescripcionSegment(segment.getDescripcionSegment());

        segmentService.segmentUpdate(existingSegment);
        attributes.addFlashAttribute("info","¡Segmento editado con éxito!");
        return "redirect:/segment";
    }

    //
    @GetMapping("/segment/{id}")
    public String removeSegment(@PathVariable Long id, RedirectAttributes attributes){
        segmentService.segmentRemove(id);
        attributes.addFlashAttribute("warning","¡Segmento eliminado con éxito!");
        return "redirect:/segment";
    }


}
