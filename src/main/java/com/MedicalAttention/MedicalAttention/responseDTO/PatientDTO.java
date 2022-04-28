package com.MedicalAttention.MedicalAttention.responseDTO;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import com.MedicalAttention.MedicalAttention.entity.Patient;

public class PatientDTO {
    private Integer id;
    private String fullName;
    private Date birthDate;
    private String ped;
    private List<VitalSignDTO> vitalSignsDTO;

    public PatientDTO() {
    }

    public PatientDTO(Patient patient) {
        this.id = patient.getId();
        this.fullName = patient.getFullName();
        this.birthDate = patient.getBirthDate();
        this.ped= patient.getPed();
        this.vitalSignsDTO = new ArrayList<>();
        patient.getVitalSigns().forEach(sv -> this.vitalSignsDTO.add(new VitalSignDTO(sv)));
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public List<VitalSignDTO> getVitalSignsDTO() {
        return vitalSignsDTO;
    }

    public void setSignosVitalesDTO(List<VitalSignDTO> signosVitalesDTO) {
        this.vitalSignsDTO = signosVitalesDTO;
    }

    public String getPed() {
        return ped;
    }

    public void setPed(String ped) {
        this.ped = ped;
    }
}

