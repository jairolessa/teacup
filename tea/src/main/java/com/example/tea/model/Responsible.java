package com.example.tea.model;

import jakarta.persistence.*;

@Entity
public class Responsible extends Person{

    @Id
    private Long id;
    private String email;
    private String cep;
    private String publicPlace;
    private String number;
    private String complement;
    private String state;
    private String city;

    @OneToOne
    @MapsId
    private Account user;
}
