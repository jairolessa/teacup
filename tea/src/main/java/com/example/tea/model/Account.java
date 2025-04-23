package com.example.tea.model;

import jakarta.persistence.*;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String password;
    private Boolean active;

    @OneToOne
    private Responsible responsible;

    public Account(String userName, String password, Boolean active, Responsible responsible) {
        this.userName = userName;
        this.password = password;
        this.active = active;
        this.responsible = responsible;
    }
}
