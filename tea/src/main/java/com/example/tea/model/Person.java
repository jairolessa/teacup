package com.example.tea.model;

import jakarta.persistence.*;

import java.util.Date;

@MappedSuperclass
public class Person {

    @Id
    private Long id;
    private String fullName;
    private String cpf;
    private Date dateBirth;
    private String nationality;

    @Enumerated(EnumType.STRING)
    private Gender gender;

}
