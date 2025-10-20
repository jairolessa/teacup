package com.projetoTEA5.demo.mapper;

import com.projetoTEA5.demo.dto.ResponsibleDto;
import com.projetoTEA5.demo.model.Responsible;

public class ResponsibleMapper {
    public static Responsible toEntity(ResponsibleDto responsibleDto){
        Responsible entity = new Responsible();
        entity.setFullName(responsibleDto.getFullName());
        entity.setCpf(responsibleDto.getCpf());
        entity.setBirthDate(responsibleDto.getBirthDate());
        entity.setGender(responsibleDto.getGender());
        entity.setContactNumber(responsibleDto.getContactNumber());
        entity.setCep(responsibleDto.getCep());
        entity.setPublicPlace(responsibleDto.getPublicPlace());
        entity.setHouseNumber(responsibleDto.getHouseNumber());
        entity.setNeighbourhood(responsibleDto.getNeighbourhood());
        entity.setCity(responsibleDto.getCity());
        entity.setState(responsibleDto.getState());
        entity.setComplement(responsibleDto.getComplement());
        entity.setEmail(responsibleDto.getEmail());
        entity.setPassword(responsibleDto.getPassword());
        entity.setActive(true);
        return entity;
    }

    public static ResponsibleDto toDTO(Responsible entity) {
        ResponsibleDto responsibleDto = new ResponsibleDto();
        responsibleDto.setFullName(entity.getFullName());
        responsibleDto.setCpf(entity.getCpf());
        responsibleDto.setBirthDate(entity.getBirthDate());
        responsibleDto.setGender(entity.getGender());
        responsibleDto.setContactNumber(entity.getContactNumber());
        responsibleDto.setCep(entity.getCep());
        responsibleDto.setPublicPlace(entity.getPublicPlace());
        responsibleDto.setHouseNumber(entity.getHouseNumber());
        responsibleDto.setNeighbourhood(entity.getNeighbourhood());
        responsibleDto.setCity(entity.getCity());
        responsibleDto.setState(entity.getState());
        responsibleDto.setComplement(entity.getComplement());
        responsibleDto.setEmail(entity.getEmail());
        return responsibleDto;
    }
}
