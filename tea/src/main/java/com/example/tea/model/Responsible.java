package com.example.tea.model;

import jakarta.persistence.*;

@Entity
public class Responsible extends Person{

    private String email;

    @Enumerated(EnumType.STRING)
    private Bond bond;

    @OneToOne
    @MapsId
    private Account account;

    @OneToOne(mappedBy = "responsible", cascade = CascadeType.ALL)
    private ResponsibleAdress adress;
}
