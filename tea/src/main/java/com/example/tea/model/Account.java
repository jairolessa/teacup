package com.example.tea.model;

import jakarta.persistence.*;

@Entity
public class Account {

    @Id
    private Long id;
    private String userName;
    private String password;
    private Boolean active;

    @OneToOne(mappedBy = "account", cascade = CascadeType.ALL)
    private Responsible responsible;
}
