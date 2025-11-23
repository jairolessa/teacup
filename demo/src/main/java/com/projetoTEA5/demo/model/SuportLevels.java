package com.projetoTEA5.demo.model;

public enum SuportLevels {

    SUPORTE_LEVE("Nível de Suporte Leve"),
    SUPOETE_MODERADO("Nível de Suporte Moderado"),
    SUPORTE_SEVERO("Nível de Suporte Severo"),
    NAO_INFORMADO("Nível de Suporte não informado");

    private String suportLevels;

    SuportLevels(String suportLevels){
        this.suportLevels = suportLevels;
    }

    public String getSuportLevels() {
        return suportLevels;
    }
}
