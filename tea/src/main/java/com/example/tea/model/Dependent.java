package com.example.tea.model;

import jakarta.persistence.*;

@Entity
public class Dependent extends Person{

    private String supportLevelTea;
    private String medicalReport;
}
