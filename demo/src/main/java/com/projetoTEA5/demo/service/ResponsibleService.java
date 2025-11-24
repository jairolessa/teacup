package com.projetoTEA5.demo.service;

import com.projetoTEA5.demo.dto.ResponsibleDto;
import com.projetoTEA5.demo.mapper.ResponsibleMapper;
import com.projetoTEA5.demo.model.Account;
import com.projetoTEA5.demo.model.Dependent;
import com.projetoTEA5.demo.model.Responsible;
import com.projetoTEA5.demo.repository.AccountRepository;
import com.projetoTEA5.demo.repository.ResponsibleRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

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

        Responsible responsible = responsibleMapper.toResponsible(responsibleDto);
        Account account = responsibleMapper.toAccount(responsibleDto, responsible);

        responsible.setAccount(account);
        account.setResponsible(responsible);

        responsibleRepository.save(responsible);
        accountRepository.save(account);
    }

    public List<Dependent> loadDependents(Account account){

        Responsible responsible = responsibleRepository.findByAccount(account)
                .orElseThrow(() -> new RuntimeException("Responsável não encontrado!"));

        List<Dependent> dependents = responsible.getDependents();

        return dependents;
    }
    public void cpfValidation(String cpf){

    }
}
