package com.projetoTEA5.demo.controller;

import com.projetoTEA5.demo.dto.ResponsibleDto;
import com.projetoTEA5.demo.model.Account;
import com.projetoTEA5.demo.model.Bond;
import com.projetoTEA5.demo.model.Dependent;
import com.projetoTEA5.demo.model.SuportLevels;
import com.projetoTEA5.demo.service.ResponsibleService;
import jakarta.validation.Valid;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller()
@RequestMapping("/responsible")
public class ResponsibleController {

    private final ResponsibleService responsibleService;

    public ResponsibleController(ResponsibleService responsibleService){
        this.responsibleService = responsibleService;
    }

    @PostMapping("/new")
    public String registerResponsible(@Valid @ModelAttribute ResponsibleDto responsibleDto,
                                      BindingResult result, Model model){

        if(result.hasErrors()){
            return "tutor-cad";
        }

        responsibleService.saveResponsible(responsibleDto);

        return "redirect:/tutor-login";
    }

    @GetMapping("/portal")
    public String portal(@AuthenticationPrincipal Account account, Model model){

        List<Dependent> dependents = responsibleService.loadDependents(account);

        model.addAttribute("dependents", dependents);
        model.addAttribute("supportLevels", SuportLevels.values());
        model.addAttribute("bond", Bond.values());

        return "portal";
    }

    @GetMapping("/news")
    public String news(){
        return "news";
    }

    @GetMapping("/profile")
    public String profile(){
        return "profile";
    }

    @GetMapping("/story")
    public String story(){
        return "story";
    }

    @GetMapping("/video")
    public String video(){
        return "video";
    }

}
