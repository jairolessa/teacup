package com.projetoTEA5.demo.dto;

import com.projetoTEA5.demo.model.Gender;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

public class ResponsibleDto {

    private Long id;

    @NotBlank(message = "O nome completo é obrigatório!")
    @Size(min = 10, message = "O nome deve ser completo!")
    private String fullName;

    @NotBlank(message = "O cpf é obrigatório!")
    @Pattern(regexp = "^\\d{11}$", message = "O CPF deve conter 11 dígitos numéricos")
    @CPF(message = "CPF inválido. Verifique os dígitos.")
    private String cpf;

    @NotNull(message = "A data de nascimento é obrigatória!")
    private LocalDate birthDate;

    @NotNull(message = "O gênero é obrigatório!")
    private Gender gender;

    @NotBlank(message = "O número de contato é obrigatório!")
    private String contactNumber;

    @NotBlank(message = "O cep é obrigatório!")
    private String cep;

    @NotBlank(message = "O logradouro é obrigatório!")
    private String publicPlace;
    private String houseNumber;

    @NotBlank(message = "O bairro é obrigatório!")
    private String neighbourhood;

    @NotBlank(message = "A cidade é obrigatória!")
    private String city;

    @NotBlank(message = "O estado é obrigatório!")
    private String state;
    private String complement;

    @Email(message = "E-mail inválido.")
    @NotBlank(message = "O e-mail é obrigatório.")
    private String email;

    private String username;

    @NotBlank(message = "A senha é obrigatória!")
    private String password;
    private Boolean active = true;

    public ResponsibleDto() {
    }

    public ResponsibleDto(String fullName, String cpf, LocalDate birthDate, Gender gender, String contactNumber, String cep, String publicPlace, String houseNumber, String neighbourhood, String city, String state, String password, String email, String complement, Boolean active) {
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
