package com.projetoTEA5.demo.model;

public enum SuportLevels {

    SUPORTE_LEVE("Nível 1 de Suporte (Leve)"),
    SUPORTE_MODERADO("Nível 2 de Suporte (Moderado)"),
    SUPORTE_SEVERO("Nível 3 de Suporte (Severo)"),
    NAO_INFORMADO("Prefiro não informar");

    private String suportLevels;

    SuportLevels(String suportLevels){
        this.suportLevels = suportLevels;
    }

    public String getSuportLevels() {
        return suportLevels;
    }
}
