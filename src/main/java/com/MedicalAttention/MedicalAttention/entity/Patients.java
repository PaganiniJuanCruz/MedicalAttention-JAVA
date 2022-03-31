package com.MedicalAttention.medicalAttention.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Patients {

    @Id
    private Integer id;
    private String name;
    private Date birthday;
    private VitalSigns signs;

    public Patients(){

    }

    public Patients(Integer id, String name, Date birthday, VitalSigns signs) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.signs = signs;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public VitalSigns getSigns() {
        return signs;
    }

    public void setSigns(VitalSigns signs) {
        this.signs = signs;
    }

    @Override
    public String toString() {
        return "Patients{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", signs=" + signs +
                '}';
    }
}
