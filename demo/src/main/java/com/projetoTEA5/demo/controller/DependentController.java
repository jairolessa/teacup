package com.projetoTEA5.demo.controller;

import com.projetoTEA5.demo.dto.DependentDto;
import com.projetoTEA5.demo.model.Account;
import com.projetoTEA5.demo.service.DependentService;
import jakarta.validation.Valid;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dependent")
public class DependentController {

    private final DependentService dependentService;

    public DependentController(DependentService dependentService){
        this.dependentService = dependentService;
    }

    @GetMapping("tea-cad")
    public String registerDependent(){
        return "tea-cad";
    }

    @PostMapping("/new-dependent")
    public String saveNewDependent(@Valid @ModelAttribute DependentDto dependentDto,
                                   @AuthenticationPrincipal Account account){

        dependentService.saveDependent(dependentDto, account);

        return "redirect:/responsible/portal";
    }
}
