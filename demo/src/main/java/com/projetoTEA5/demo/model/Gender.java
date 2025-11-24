package com.projetoTEA5.demo.model;

public enum Gender {

    MASCULINO("Masculino"),
    FEMININO("Feminino"),
    OUTRO("Outro"),
    NAO_INFORMADO("Prefiro não informar");

    private String gender;

    Gender(String gender){
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
