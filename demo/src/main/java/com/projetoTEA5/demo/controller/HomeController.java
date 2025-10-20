package com.projetoTEA5.demo.controller;

import com.projetoTEA5.demo.dto.ResponsibleDto;
import com.projetoTEA5.demo.model.Responsible;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage(){
        return "homepage";
    }

    @GetMapping("/tutor-cad")
    public String registerUser(){
        return  "tutor-cad";
    }

    @GetMapping("/tutor-login")
    public String login(){
        return "tutor-login";
    }
}
