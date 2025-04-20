package com.example.tea.model;

import jakarta.persistence.*;

@Entity
public class ResponsibleAdress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
