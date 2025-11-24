package com.projetoTEA5.demo.controller;

import com.projetoTEA5.demo.dto.DependentDto;
import com.projetoTEA5.demo.model.*;
import com.projetoTEA5.demo.service.DependentService;
import jakarta.validation.Valid;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/dependent")
public class DependentController {

    private final DependentService dependentService;

    public DependentController(DependentService dependentService){
        this.dependentService = dependentService;
    }

    @GetMapping("tea-cad")
    public String registerDependent(Model model){

        model.addAttribute("dependent", new Dependent());
        model.addAttribute("genders", Gender.values());
        model.addAttribute("bonds", Bond.values());
        model.addAttribute("suportLevels", SuportLevels.values());

        return "tea-cad";
    }

    @PostMapping("/new-dependent")
    public String saveNewDependent(@Valid @ModelAttribute DependentDto dependentDto,
                                   @AuthenticationPrincipal Account account){

        dependentService.saveDependent(dependentDto, account);

        return "redirect:/responsible/portal";
    }

    @GetMapping("/edit/{id}")
    public String editDependent(@PathVariable long id, Model model){

        Dependent dependent = dependentService.findById(id);
        model.addAttribute("dependent", dependent);
        model.addAttribute("genders", Gender.values());
        model.addAttribute("bonds", Bond.values());
        model.addAttribute("suportLevels", SuportLevels.values());

        return "tea-cad";
    }

    @PostMapping("/update")
    public String updateDependent(@ModelAttribute("dependent") Dependent dependent){

        dependentService.updateDependent(dependent);

        return "redirect:/responsible/portal";
    }

    @GetMapping("/delete/{id}")
    public String deleteDependent(@PathVariable Long id){

        dependentService.deleteDependent(id);

        return "redirect:/responsible/portal";
    }
}
