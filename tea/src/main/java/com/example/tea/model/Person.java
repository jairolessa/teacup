package com.example.tea.model;

import jakarta.persistence.*;

import java.util.Date;

@MappedSuperclass
public class Person {

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column(unique = true, length = 11)
    private String cpf;

    @Column
    private Date dateBirth;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column
    private String nationality;
}
