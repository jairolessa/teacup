package com.example.tea.controler;

import com.example.tea.model.Responsible;
import com.example.tea.repository.ResponsibleRepository;
import com.example.tea.service.ResponsibleService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/responsible")
public class ResponsibleController {

    private final ResponsibleService responsibleService;

    public ResponsibleController(ResponsibleService responsibleService) {
        this.responsibleService = responsibleService;
    }

    @GetMapping("/list")
    public String listResponsibles(Model model){
        model.addAttribute("responsibles", responsibleService.getAllResponsibles());
        return "index";
    }

    @GetMapping("/register")
    public String registerResponsible(){
        return "register_responsible";
    }

    @PostMapping("/save-responsible")
    public String saveResponsible(@ModelAttribute Responsible responsible){
        responsibleService.saveResponsible(responsible);
        return  "redirect:/responsible/list";
    }
}
