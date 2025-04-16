package com.example.tea.model;

import jakarta.persistence.*;

@Entity
public class Dependent extends Person{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
