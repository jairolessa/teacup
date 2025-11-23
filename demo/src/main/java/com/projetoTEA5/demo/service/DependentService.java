package com.projetoTEA5.demo.service;

import com.projetoTEA5.demo.dto.DependentDto;
import com.projetoTEA5.demo.mapper.DependentMapper;
import com.projetoTEA5.demo.model.Account;
import com.projetoTEA5.demo.model.Dependent;
import com.projetoTEA5.demo.repository.DependentRepository;
import org.springframework.stereotype.Service;

@Service
public class DependentService {

    private final DependentRepository dependentRepository;
    private final DependentMapper dependentMapper;

    public DependentService(DependentRepository dependentRepository , DependentMapper dependentMapper){
        this.dependentRepository = dependentRepository;
        this.dependentMapper = dependentMapper;
    }

    public void saveDependent(DependentDto dependentDto, Account account){

        dependentDto.setResponsible(account.getResponsible());
        Dependent dependent = dependentMapper.toDependent(dependentDto);
        dependentRepository.save(dependent);
    }
}
