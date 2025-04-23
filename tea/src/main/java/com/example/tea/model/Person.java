package com.example.tea.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@MappedSuperclass
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String cpf;
    private LocalDate dateBirth;
    private String nationality;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    public Person() {
    }

    public Person(String fullName, String cpf,LocalDate dateBirth, String nationality, Gender gender) {
        this.fullName = fullName;
        this.cpf = cpf;
        this.dateBirth = dateBirth;
        this.nationality = nationality;
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(LocalDate dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
