package com.example.tea.model;

public enum Gender {

    MALE("Masculino"),
    FEMALE("Feminino");

    private String gender;

    Gender(String gender){this.gender = gender;}

    public String getGender(){return gender;}
}
