package com.project.canvas.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConfigurationController {


    @GetMapping("configuration")
    public String configurationPage(Model model){
        model.addAttribute("configuration");

        return "configuration-templates/configuration";
    }


}
