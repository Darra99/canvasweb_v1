package com.project.canvas.Controller;

import com.project.canvas.Entity.Channels;
import com.project.canvas.Entity.ChannelsType;
import com.project.canvas.Service.ChannelsService;
import com.project.canvas.Service.ChannelsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ChannelsController {

    @Autowired
    private ChannelsService channelsService;
    @Autowired
    private ChannelsTypeService channelsTypeService;


    @GetMapping("/channels")
    public String channelsList(Model model){
        model.addAttribute("channels",channelsService.channelsListAll());
        return "/channels-templates/channels";
    }


    @GetMapping("/channels/create")
    public String createChannels(Model model) {


        Channels channels = new Channels();
        List<ChannelsType> listChannelsType = channelsTypeService.channelsTypeListAll();

        model.addAttribute("channels", channels);
        model.addAttribute("channelstype", listChannelsType);

        return "/channels-templates/channels_create";
    }

    @PostMapping("/channels")
    public String saveChannels(@ModelAttribute Channels channels){
        channelsService.channelsSave(channels);
        return "redirect:/channels";
    }

    @GetMapping("/channels/edit/{id}")
    public String editChannels(@PathVariable("id") Long idChannels,Model model, RedirectAttributes attributes) {

        Channels channels = channelsService.channelsGetById(idChannels);
        List<ChannelsType> listChannelsType = channelsTypeService.channelsTypeListAll();

        model.addAttribute("channels", channels);
        model.addAttribute("channelstype", listChannelsType);
        attributes.addFlashAttribute("info","¡Canal editado con éxito!");
        return "channels-templates/channels_create";
    }


    @GetMapping("/channels/delete/{id}")
    public String removeChannels(@PathVariable("id") Long idChannels, RedirectAttributes attributes){
        channelsService.channelsRemove(idChannels);
        attributes.addFlashAttribute("warning","¡Canal eliminado con éxito!");
        return "redirect:/channels";
    }

}
