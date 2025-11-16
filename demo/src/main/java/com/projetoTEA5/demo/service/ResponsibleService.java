package com.projetoTEA5.demo.service;

import com.projetoTEA5.demo.dto.ResponsibleDto;
import com.projetoTEA5.demo.mapper.ResponsibleMapper;
import com.projetoTEA5.demo.model.Account;
import com.projetoTEA5.demo.model.Responsible;
import com.projetoTEA5.demo.repository.AccountRepository;
import com.projetoTEA5.demo.repository.ResponsibleRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class ResponsibleService {

    private final ResponsibleRepository responsibleRepository;
    private final AccountRepository accountRepository;
    private final ResponsibleMapper responsibleMapper;


    public ResponsibleService(ResponsibleRepository responsibleRepository, AccountRepository accountRepository ,ResponsibleMapper responsibleMapper){
        this.responsibleRepository = responsibleRepository;
        this.accountRepository = accountRepository;
        this.responsibleMapper = responsibleMapper;
    }

    @Transactional
    public void saveResponsible(ResponsibleDto responsibleDto){
        System.out.println("Save Responsible");
        Responsible responsible = responsibleMapper.toResponsible(responsibleDto);
        System.out.println(responsible.toString());
        responsibleRepository.save(responsible);

        Account account = responsibleMapper.toAccount(responsibleDto, responsible);
        accountRepository.save(account);
    }
}
