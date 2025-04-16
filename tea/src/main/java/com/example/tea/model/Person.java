package com.example.tea.model;

import jakarta.persistence.*;

import java.util.Date;

@MappedSuperclass
public class Person {


    private String firstName;
    private String lastName;
    private String cpf;
    private Date dateBirth;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String nationality;
}
