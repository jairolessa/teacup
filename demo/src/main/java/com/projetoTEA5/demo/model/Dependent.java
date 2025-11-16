package com.projetoTEA5.demo.model;

import jakarta.persistence.Column;

public class Dependent extends Person{

    @Column(nullable = false)
    private String bondNature;

    @Column(nullable = false)
    private String supportLevels;

    private String educationInstitute;
    private String healthInfo;

    @Column(nullable = false)
    private String emergencyContact;

    @Column(nullable = false)
    private String diagnostic;
}
