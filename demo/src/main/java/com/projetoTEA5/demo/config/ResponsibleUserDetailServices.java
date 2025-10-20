package com.projetoTEA5.demo.config;

import com.projetoTEA5.demo.model.Responsible;
import com.projetoTEA5.demo.service.ResponsibleService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ResponsibleUserDetailServices {
    private final ResponsibleService responsibleService;

    public ResponsibleUserDetailServices(ResponsibleService responsibleService){
        this.responsibleService = responsibleService;
    }

    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        // Encontra o usuário pelo e-mail
        Responsible responsible = responsibleService.responsibleByUsername(email);

        if (responsible == null) {
            throw new UsernameNotFoundException("Usuário não encontrado: " + email);
        }

        // Como a classe Responsible implementa UserDetails, você pode retorná-la diretamente
        // E agora o Spring Security fará o trabalho de verificar a senha.
        return responsible;
    }
}
