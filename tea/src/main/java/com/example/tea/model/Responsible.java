package com.example.tea.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Responsible extends Person{

    private String email;

    @Enumerated(EnumType.STRING)
    private Bond bond;
}
