package com.projetoTEA5.demo.model;

import jakarta.persistence.Enumerated;

public enum Gender {

    MASCULINO("MASCULINO"),
    FEMININO("FEMININO"),
    OUTRO("OUTRO"),
    NAO_INFORMADO("NAO-INFORMADO");

    private String gender;

    Gender(String gender){
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
