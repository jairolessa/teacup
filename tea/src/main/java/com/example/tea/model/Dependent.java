package com.example.tea.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Dependent extends Person{

    private String supportLevelTea;
    private String medicalReport;

    @ManyToOne
    private Responsible responsible;

    public Dependent() {
    }

    public Dependent(String fullName, String cpf, LocalDate dateBirth, String nationality, Gender gender, String supportLevelTea, String medicalReport, Responsible responsible) {
        super(fullName, cpf, dateBirth, nationality, gender);
        this.supportLevelTea = supportLevelTea;
        this.medicalReport = medicalReport;
        this.responsible = responsible;
    }

    public String getSupportLevelTea() {
        return supportLevelTea;
    }

    public void setSupportLevelTea(String supportLevelTea) {
        this.supportLevelTea = supportLevelTea;
    }

    public String getMedicalReport() {
        return medicalReport;
    }

    public void setMedicalReport(String medicalReport) {
        this.medicalReport = medicalReport;
    }

    public Responsible getResponsible() {
        return responsible;
    }

    public void setResponsible(Responsible responsible) {
        this.responsible = responsible;
    }
}
