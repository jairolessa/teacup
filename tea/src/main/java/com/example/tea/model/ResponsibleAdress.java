package com.example.tea.model;

import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class ResponsibleAdress {

    @Id
    private Long id;
    private String cep;
    private String publicPlace;
    private String number;
    private String neighborhood;
    private String complement;
    private String referencePoint;
    private String state;
    private String city;

    @OneToOne
    private Responsible responsible;
}
