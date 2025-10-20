package com.projetoTEA5.demo.controller;

import com.projetoTEA5.demo.dto.ResponsibleDto;
import com.projetoTEA5.demo.model.Responsible;
import com.projetoTEA5.demo.service.ResponsibleService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.security.web.context.SecurityContextRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller()
@RequestMapping("/responsible")
public class ResponsibleController {

    @Autowired
    private final ResponsibleService responsibleService;

    public ResponsibleController(ResponsibleService responsibleService){
        this.responsibleService = responsibleService;
    }

    @PostMapping("/new")
    public String registerResponsible(@ModelAttribute ResponsibleDto responsibleDto){
        System.out.println(responsibleDto.toString());
        responsibleService.saveResponsible(responsibleDto);
        return "redirect:/tutor-login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("userName") String username,
                        @RequestParam("password") String password,
                        SecurityContext currentContext,
                        HttpServletRequest request,
                        HttpServletResponse response){

        Responsible responsible = responsibleService.responsibleByUsername(username);

        if(responsible == null || !responsibleService.verifyPassword(password, responsible.getPassword())){
            return "redirect:/tutor-login?error=true";
        }

        List<SimpleGrantedAuthority> authorities = List.of(new SimpleGrantedAuthority("ROLE_USER"));

        UsernamePasswordAuthenticationToken authentication =
                new UsernamePasswordAuthenticationToken(responsible, null, authorities);

        currentContext.setAuthentication(authentication);

        SecurityContextRepository securityContextRepository = new HttpSessionSecurityContextRepository();
        securityContextRepository.saveContext(currentContext, request, response);

        return "portal";
    }

    @GetMapping("/portal")
    public String portal(){
        return "portal";
    }

    @GetMapping("tea-cad")
    public String registerDependent(){
        return "tea-cad";
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

    @GetMapping("/directory")
    public String directory(){
        return "directory";
    }
}
