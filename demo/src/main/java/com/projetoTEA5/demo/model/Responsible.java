package com.projetoTEA5.demo.model;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class Responsible extends Person{

    @Column(name = "contact_number")
    private String contactNumber;

    @Column(nullable = false)
    private String cep;

    @Column(name = "public_place", nullable = false)
    private String publicPlace;

    @Column(name = "house_number")
    private String houseNumber;

    @Column(nullable = false)
    private String neighbourhood;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private String complement;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private Boolean active = true;

    @OneToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @OneToMany(mappedBy = "responsible", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Dependent> dependents = new ArrayList<>();

    public Responsible(String contactNumber, String cep, String publicPlace, String houseNumber,
                       String neighbourhood, String city, String state, String complement, String email,
                       Boolean active) {
        this.contactNumber = contactNumber;
        this.cep = cep;
        this.publicPlace = publicPlace;
        this.houseNumber = houseNumber;
        this.neighbourhood = neighbourhood;
        this.city = city;
        this.state = state;
        this.complement = complement;
        this.email = email;
        this.active = active;
    }

    public Responsible(){}

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPublicPlace() {
        return publicPlace;
    }

    public void setPublicPlace(String publicPlace) {
        this.publicPlace = publicPlace;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public List<Dependent> getDependents() {
        return dependents;
    }

    public void setDependents(List<Dependent> dependents) {
        this.dependents = dependents;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Responsible{" +
                "contactNumber='" + contactNumber + '\'' +
                ", cep='" + cep + '\'' +
                ", publicPlace='" + publicPlace + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", neighbourhood='" + neighbourhood + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", complement='" + complement + '\'' +
                ", email='" + email + '\'' +
                ", active=" + active +
                "} " + super.toString();
    }
}
