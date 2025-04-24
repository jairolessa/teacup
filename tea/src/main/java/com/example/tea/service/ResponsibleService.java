package com.example.tea.service;

import com.example.tea.model.Responsible;
import com.example.tea.repository.ResponsibleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResponsibleService {

    private final ResponsibleRepository responsibleRepository;

    public ResponsibleService(ResponsibleRepository responsibleRepository) {
        this.responsibleRepository = responsibleRepository;
    }

    public void saveResponsible(Responsible responsible){
        responsibleRepository.save(responsible);
    }

    public List<Responsible> getAllResponsibles(){
        return responsibleRepository.findAll();
    }
}
