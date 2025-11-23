package com.projetoTEA5.demo.mapper;

import com.projetoTEA5.demo.dto.ResponsibleDto;
import com.projetoTEA5.demo.model.Account;
import com.projetoTEA5.demo.model.Responsible;
import org.hibernate.annotations.Comment;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class ResponsibleMapper {

    private final PasswordEncoder passwordEncoder;

    public ResponsibleMapper(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    public Responsible toResponsible(ResponsibleDto dto) {
        Responsible responsible = new Responsible();

        responsible.setFullName(dto.getFullName());
        responsible.setCpf(dto.getCpf());
        responsible.setGender(dto.getGender());
        responsible.setBirthDate(dto.getBirthDate());
        responsible.setContactNumber(dto.getContactNumber());
        responsible.setCep(dto.getCep());
        responsible.setPublicPlace(dto.getPublicPlace());
        responsible.setHouseNumber(dto.getHouseNumber());
        responsible.setNeighbourhood(dto.getNeighbourhood());
        responsible.setCity(dto.getCity());
        responsible.setState(dto.getState());
        responsible.setComplement(dto.getComplement());
        responsible.setEmail(dto.getEmail());
        responsible.setActive(true);

        return responsible;
    }

    public Account toAccount(ResponsibleDto dto, Responsible responsible) {
        Account account = new Account();

        account.setUsername(dto.getEmail());
        account.setPassword(passwordEncoder.encode(dto.getPassword()));
        account.setActive(true);
        account.setResponsible(responsible);

        return account;
    }
}
