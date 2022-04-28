package com.MedicalAttention.MedicalAttention.entity;

import com.MedicalAttention.MedicalAttention.generic.GenericEntity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Patient implements GenericEntity<Patient, Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String fullName;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column (name= "pre-existing_diseases")
    private String ped;

    @OneToMany(mappedBy = "patient", cascade = CascadeType.ALL)
    private List<VitalSign> vitalSigns;

    public Patient() {
    }

    public Patient(String fullName, Date birthDate,String ped, List<VitalSign> vitalSigns) {
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.ped= ped;
        this.vitalSigns = vitalSigns;
    }

    public void addSignoVital(VitalSign vitalSign){
        if( this.vitalSigns == null){
            this.vitalSigns = new ArrayList<>();
        }
        this.vitalSigns.add(vitalSign);
        vitalSign.setPatient(this);
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

    public List<VitalSign> getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(List<VitalSign> vitalSigns) {
        this.vitalSigns = vitalSigns;
    }


    public String getPed() {
        return ped;
    }

    public void setPed(String ped) {
        this.ped = ped;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthDate=" + birthDate +
                ", ped="+ ped +
                ", vitalSigns=" + vitalSigns +
                '}';
    }
}
