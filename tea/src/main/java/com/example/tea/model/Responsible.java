package com.example.tea.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
public class Responsible extends Person{

    private String email;

    @Enumerated(EnumType.STRING)
    private Bond bond;

    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;

    public Responsible(){}

    public Responsible(String fullName, String cpf, LocalDate dateBirth, String nationality, Gender gender, String email, Bond bond, Account account) {
        super(fullName, cpf, dateBirth, nationality, gender);
        this.email = email;
        this.bond = bond;
        this.account = account;
    }

    @Override
    public Long getId() {
        return super.getId();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Bond getBond() {
        return bond;
    }

    public void setBond(Bond bond) {
        this.bond = bond;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
