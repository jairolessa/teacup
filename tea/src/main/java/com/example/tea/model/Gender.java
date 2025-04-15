package com.example.tea.model;

public enum Gender {

    MASCULINO("Masculino"),
    FEMININO("Feminino");

    private String gender;

    Gender(String gender){this.gender = gender;}

    public String getGender(){return gender;}
}
