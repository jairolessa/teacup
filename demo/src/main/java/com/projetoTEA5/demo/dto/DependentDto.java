package com.projetoTEA5.demo.dto;

import com.projetoTEA5.demo.model.Bond;
import com.projetoTEA5.demo.model.Gender;
import com.projetoTEA5.demo.model.Responsible;
import com.projetoTEA5.demo.model.SuportLevels;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class DependentDto {

    @NotBlank(message = "O nome completo é obrigatório!")
    @Size(min = 10, message = "O nome deve ser completo!")
    private String fullName;

    @NotBlank(message = "O cpf é obrigatório!")
    @Pattern(regexp = "^\\d{11}$", message = "O CPF deve conter 11 dígitos numéricos")
    @CPF(message = "CPF inválido. Verifique os dígitos.")
    private String cpf;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "A data de nascimento é obrigatória!")
    private LocalDate birthDate;

    @NotNull(message = "O gênero é obrigatório!")
    private Gender gender;
    private String contactNumber;

    @NotNull(message = "A natureza do vínculo é obrigatória!")
    private Bond bondNature;

    @NotNull(message = "O nível de suporte e obrigatório!")
    private SuportLevels supportLevels;
    private String educationInstitute;
    private String healthInfo;
    private String emergencyContact;

    private String diagnostic;
    private Responsible responsible;

    public DependentDto(String fullName, String cpf, LocalDate birthDate, Gender gender,
                        String contactNumber, Bond bondNature, SuportLevels supportLevels, String healthInfo,
                        String educationInstitute, String emergencyContact, String diagnostic,
                        Responsible responsible) {

        this.fullName = fullName;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.gender = gender;
        this.contactNumber = contactNumber;
        this.bondNature = bondNature;
        this.supportLevels = supportLevels;
        this.healthInfo = healthInfo;
        this.educationInstitute = educationInstitute;
        this.emergencyContact = emergencyContact;
        this.diagnostic = diagnostic;
        this.responsible = responsible;
    }

    public DependentDto() {
    }

    public @NotBlank(message = "O nome completo é obrigatório!") @Size(min = 3, message = "O nome deve ser completo!") String getFullName() {
        return fullName;
    }

    public void setFullName(@NotBlank(message = "O nome completo é obrigatório!") @Size(min = 3, message = "O nome deve ser completo!") String fullName) {
        this.fullName = fullName;
    }

    public @NotBlank(message = "O cpf é obrigatório!") String getCpf() {
        return cpf;
    }

    public void setCpf(@NotBlank(message = "O cpf é obrigatório!") String cpf) {this.cpf = cpf;}

    public @NotNull(message = "A data de nascimento é obrigatória!") LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(@NotNull(message = "A data de nascimento é obrigatória!") LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public @NotNull(message = "O gênero é obrigatório!") Gender getGender() {
        return gender;
    }

    public void setGender(@NotNull(message = "O gênero é obrigatório!") Gender gender) {
        this.gender = gender;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public @NotNull(message = "A natureza do vínculo é obrigatória!") Bond getBondNature() {
        return bondNature;
    }

    public void setBondNature(@NotNull(message = "A natureza do vínculo é obrigatória!") Bond bondNature) {
        this.bondNature = bondNature;
    }

    public @NotNull(message = "O nível de suporte e obrigatório!") SuportLevels getSupportLevels() {
        return supportLevels;
    }

    public void setSupportLevels(@NotNull(message = "O nível de suporte e obrigatório!") SuportLevels supportLevels) {
        this.supportLevels = supportLevels;
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

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public Responsible getResponsible() {
        return responsible;
    }

    public void setResponsible(Responsible responsible) {
        this.responsible = responsible;
    }

    @Override
    public String toString() {
        return "DependentDto{" +
                ", fullName='" + fullName + '\'' +
                ", cpf='" + cpf + '\'' +
                ", birthDate=" + birthDate +
                ", gender=" + gender +
                ", contactNumber='" + contactNumber + '\'' +
                ", bondNature='" + bondNature + '\'' +
                ", supportLevels='" + supportLevels + '\'' +
                ", educationInstitute='" + educationInstitute + '\'' +
                ", healthInfo='" + healthInfo + '\'' +
                ", emergencyContact='" + emergencyContact + '\'' +
                ", diagnostic='" + diagnostic + '\'' +
                '}';
    }
}
