package com.example.tea.model;

import jakarta.persistence.*;

@Entity
public class Responsible extends Person{

    @Id
    private Long id;

    @Column(unique = true)
    private String email;

    @Column
    private String cep;

    @Column
    private String publicPlace;

    @Column
    private String number;

    @Column
    private String complement;

    @Column
    private String state;

    @Column
    private String city;

    @OneToOne
    @MapsId
    private Account user;
}
