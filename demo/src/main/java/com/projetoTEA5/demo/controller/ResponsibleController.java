package com.projetoTEA5.demo.controller;

import com.projetoTEA5.demo.dto.ResponsibleDto;
import com.projetoTEA5.demo.service.ResponsibleService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller()
@RequestMapping("/responsible")
public class ResponsibleController {

    private final ResponsibleService responsibleService;

    public ResponsibleController(ResponsibleService responsibleService){
        this.responsibleService = responsibleService;
    }

    @PostMapping("/new")
    public String registerResponsible(@Valid @ModelAttribute ResponsibleDto responsibleDto){
        System.out.println(responsibleDto.toString());
        responsibleService.saveResponsible(responsibleDto);
        return "redirect:/tutor-login";
    }

//    @PostMapping("/login")
//    public String login(@RequestParam("username") String username,
//                        @RequestParam("password") String password,
//                        SecurityContext currentContext,
//                        HttpServletRequest request,
//                        HttpServletResponse response){
//
//        System.out.println(username);
//        System.out.println(password);
//        System.out.println(currentContext);
//        System.out.println(request);
//        System.out.println(response);
//
//        Account account = accountService.accountByUsername(username);
//
//        if(account == null || !accountService.verifyPassword(password, account.getPassword())){
//            return "redirect:/tutor-login?error=true";
//        }
//
//        List<SimpleGrantedAuthority> authorities = List.of(new SimpleGrantedAuthority("ROLE_USER"));
//
//        UsernamePasswordAuthenticationToken authentication =
//                new UsernamePasswordAuthenticationToken(account, null, authorities);
//
//        currentContext.setAuthentication(authentication);
//
//        SecurityContextRepository securityContextRepository = new HttpSessionSecurityContextRepository();
//        securityContextRepository.saveContext(currentContext, request, response);
//
//        return "portal";
//    }

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
}
