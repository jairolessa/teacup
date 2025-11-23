package com.projetoTEA5.demo.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Dependent extends Person{

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Bond bondNature;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private SuportLevels supportLevels;
    private String contactNumber;

    private String educationInstitute;
    private String healthInfo;

    @Column(nullable = false)
    private String emergencyContact;

    private String diagnostic;

    @ManyToOne
    @JoinColumn(name = "responsible_id")
    private Responsible responsible;

    public Dependent(String fullName, String cpf, LocalDate birthDate, Gender gender, Bond bondNature,
                     SuportLevels supportLevels, String contactNumber, String educationInstitute,
                     String healthInfo, String emergencyContact, String diagnostic,
                     Responsible responsible) {

        super(fullName, cpf, birthDate, gender);
        this.bondNature = bondNature;
        this.supportLevels = supportLevels;
        this.contactNumber = contactNumber;
        this.educationInstitute = educationInstitute;
        this.healthInfo = healthInfo;
        this.emergencyContact = emergencyContact;
        this.diagnostic = diagnostic;
        this.responsible = responsible;
    }

    public Dependent() {
    }

    public Bond getBondNature() {
        return bondNature;
    }

    public void setBondNature(Bond bondNature) {
        this.bondNature = bondNature;
    }

    public SuportLevels getSupportLevels() {
        return supportLevels;
    }

    public void setSupportLevels(SuportLevels supportLevels) {
        this.supportLevels = supportLevels;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEducationInstitute() {
        return educationInstitute;
    }

    public void setEducationInstitute(String educationInstitute) {
        this.educationInstitute = educationInstitute;
    }

    public String getHealthInfo() {
        return healthInfo;
    }

    public void setHealthInfo(String healthInfo) {
        this.healthInfo = healthInfo;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public Responsible getResponsible() {
        return responsible;
    }

    public void setResponsible(Responsible responsible) {
        this.responsible = responsible;
    }

    @Override
    public String toString() {
        return "Dependent{" +
                "bondNature='" + bondNature + '\'' +
                ", supportLevels='" + supportLevels + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", educationInstitute='" + educationInstitute + '\'' +
                ", healthInfo='" + healthInfo + '\'' +
                ", emergencyContact='" + emergencyContact + '\'' +
                ", diagnostic='" + diagnostic + '\'' +
                ", responsible=" + responsible +
                "} " + super.toString();
    }
}
