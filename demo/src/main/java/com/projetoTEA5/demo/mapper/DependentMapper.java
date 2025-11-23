package com.projetoTEA5.demo.mapper;

import com.projetoTEA5.demo.dto.DependentDto;
import com.projetoTEA5.demo.model.Dependent;
import org.springframework.stereotype.Component;

@Component
public class DependentMapper {

    public Dependent toDependent(DependentDto dependentDto){
        Dependent dependent = new Dependent();

        dependent.setFullName(dependentDto.getFullName());
        dependent.setCpf(dependentDto.getCpf());
        dependent.setGender(dependentDto.getGender());
        dependent.setBirthDate(dependentDto.getBirthDate());
        dependent.setBondNature(dependentDto.getBondNature());
        dependent.setEducationInstitute(dependent.getEducationInstitute());
        dependent.setDiagnostic(dependentDto.getDiagnostic());
        dependent.setHealthInfo(dependent.getHealthInfo());
        dependent.setEmergencyContact(dependentDto.getEmergencyContact());
        dependent.setSupportLevels(dependentDto.getSupportLevels());
        dependent.setContactNumber(dependent.getContactNumber());
        dependent.setResponsible(dependentDto.getResponsible());

        return dependent;
    }
}
