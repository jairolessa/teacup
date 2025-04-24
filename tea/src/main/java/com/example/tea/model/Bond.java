package com.example.tea.model;

public enum Bond {

    FAMILY("Familiar"),
    SPOUSE("Conjuge"),
    LEGALGUARDIAN("Tutor Legal");

    private String bond;

    Bond(String bond){this.bond = bond;}

    public String getBond(){return bond;}
}
