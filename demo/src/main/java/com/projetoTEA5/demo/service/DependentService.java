package com.projetoTEA5.demo.service;

import com.projetoTEA5.demo.dto.DependentDto;
import com.projetoTEA5.demo.mapper.DependentMapper;
import com.projetoTEA5.demo.model.Account;
import com.projetoTEA5.demo.model.Dependent;
import com.projetoTEA5.demo.model.Responsible;
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

    public Dependent findById(Long id){

        Dependent dependent = dependentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Dependente não encontrado!"));

        return dependent;
    }

    public void updateDependent(Dependent dependentUpdate){

        Dependent dependent = dependentRepository.findById(dependentUpdate.getId())
                .orElseThrow(() -> new RuntimeException("Dependente não encontrado!"));

        dependent.setFullName(dependent.getFullName());
        dependent.setBirthDate(dependentUpdate.getBirthDate());
        dependent.setGender(dependentUpdate.getGender());
        dependent.setBondNature(dependentUpdate.getBondNature());
        dependent.setSupportLevels(dependentUpdate.getSupportLevels());
        dependent.setContactNumber(dependentUpdate.getContactNumber());
        dependent.setEducationInstitute(dependentUpdate.getEducationInstitute());
        dependent.setHealthInfo(dependentUpdate.getHealthInfo());
        dependent.setEmergencyContact(dependentUpdate.getEmergencyContact());
        dependent.setDiagnostic(dependentUpdate.getDiagnostic());

        dependentRepository.save(dependent);
    }

    public void deleteDependent(Long id){

        Dependent dependent = dependentRepository.findById(id)
                        .orElseThrow();

        Responsible responsible = dependent.getResponsible();
        responsible.getDependents().remove(dependent);

        dependentRepository.delete(dependent);
    }
}
