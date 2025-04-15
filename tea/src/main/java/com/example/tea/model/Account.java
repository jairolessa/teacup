package com.example.tea.model;

import jakarta.persistence.*;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String userName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Boolean active;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Responsible responsible;
}
