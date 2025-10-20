package com.projetoTEA5.demo.dto;

import com.projetoTEA5.demo.model.Gender;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

public class ResponsibleDto {

    private Long id;
    private String fullName;
    private String cpf;
    private LocalDate birthDate;
    private Gender gender;
    private String contactNumber;
    private String cep;
    private String publicPlace;
    private String houseNumber;
    private String neighbourhood;
    private String city;
    private String state;
    private String complement;
    private String email;
    private String password;
    private Boolean active = true;

    public ResponsibleDto() {
    }

    public ResponsibleDto(Long id, String fullName, String cpf, LocalDate birthDate, Gender gender, String contactNumber, String cep, String publicPlace, String houseNumber, String neighbourhood, String city, String state, String password, String email, String complement, Boolean active) {
        this.id = id;
        this.fullName = fullName;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.gender = gender;
        this.contactNumber = contactNumber;
        this.cep = cep;
        this.publicPlace = publicPlace;
        this.houseNumber = houseNumber;
        this.neighbourhood = neighbourhood;
        this.city = city;
        this.state = state;
        this.password = password;
        this.email = email;
        this.complement = complement;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "ResponsibleDto{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", cpf='" + cpf + '\'' +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                ", contactNumber='" + contactNumber + '\'' +
                ", cep='" + cep + '\'' +
                ", publicPlace='" + publicPlace + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", neighbourhood='" + neighbourhood + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", complement='" + complement + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", active=" + active +
                '}';
    }
}
