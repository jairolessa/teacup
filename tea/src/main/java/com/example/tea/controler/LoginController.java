package com.example.tea.controler;

import com.example.tea.model.Account;
import com.example.tea.service.AccountService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.context.HttpSessionSecurityContextRepository;
import org.springframework.security.web.context.SecurityContextRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class LoginController {

    private AccountService accountService;

    public LoginController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/form-login")
    public String formLogin(){
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam String email,
                        @RequestParam String password,
                        SecurityContext currentContext,
                        HttpServletRequest request,
                        HttpServletResponse response){

        Account account = accountService.loadAccountByEmail(email);

        if(account == null || !accountService.verifyPassword(password, account.getPassword())){
            return "redirect:/login?error=true";
        }

        List<SimpleGrantedAuthority> authorities = List.of(new SimpleGrantedAuthority("ROLE_USER"));

        UsernamePasswordAuthenticationToken authentication =
                new UsernamePasswordAuthenticationToken(account, null, authorities);

        currentContext.setAuthentication(authentication);

        SecurityContextRepository securityContextRepository = new HttpSessionSecurityContextRepository();
        securityContextRepository.saveContext(currentContext, request, response);

        return "redirect:/responsible/list";
    }

    @GetMapping("/register-account")
    public String formRegisterResponsible(){
        System.out.println("Mostrando html registrar conta");
        return "register_account";
    }

    @PostMapping("/save-account")
    public String registerAccount(@ModelAttribute Account account){
        account.setActive(true);
        accountService.saveAccount(account);
        return "redirect:/login";
    }
}
