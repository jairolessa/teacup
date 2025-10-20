package com.projetoTEA5.demo.service;

import com.projetoTEA5.demo.dto.ResponsibleDto;
import com.projetoTEA5.demo.mapper.ResponsibleMapper;
import com.projetoTEA5.demo.model.Responsible;
import com.projetoTEA5.demo.repository.ResponsibleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ResponsibleService {

    private final ResponsibleRepository responsibleRepository;
    private final PasswordEncoder passwordEncoder;

    public ResponsibleService(ResponsibleRepository responsibleRepository, PasswordEncoder passwordEncoder){
        this.responsibleRepository = responsibleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public void saveResponsible(ResponsibleDto responsibleDto){
        System.out.println("Save Responsible");
        String encryptedPassword = passwordEncoder.encode(responsibleDto.getPassword());
        responsibleDto.setPassword(encryptedPassword);
        Responsible responsible = ResponsibleMapper.toEntity(responsibleDto);
        System.out.println(responsible.toString());
        responsibleRepository.save(responsible);
    }

    public Responsible responsibleByUsername(String username){
        return responsibleRepository.findByEmail(username);
    }

    public boolean verifyPassword(String passwordReceived, String encryptedPassword) {
        return passwordEncoder.matches(passwordReceived, encryptedPassword);
    }
}
