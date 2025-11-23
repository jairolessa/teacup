package com.projetoTEA5.demo.model;

public enum Bond {

    GENITOR("Genitor"),
    CONJUGE("Conjuge"),
    FILHO("Filho"),
    RESPONSAVEL_LEGAL("Responsável Legal"),
    OUTRO("Outro");

    private String bond;

    Bond(String bond){
        this.bond = bond;
    }

    public String getBond() {
        return bond;
    }
}
