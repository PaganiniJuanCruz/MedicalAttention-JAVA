package com.MedicalAttention.MedicalAttention.entity;

import com.MedicalAttention.MedicalAttention.generic.GenericEntity;

import javax.persistence.*;

@Entity
@Table(name = "vital_signs")
public class VitalSign implements GenericEntity<VitalSign, Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "vital_sign")
    private String vitalSign;

    @Column(name = "valor")
    private Integer valor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id")
    private Patient patient;

    public VitalSign() {
    }

    public VitalSign(String vitalSignName, Integer valor, Patient patient) {
        this.vitalSign = vitalSignName;
        this.valor = valor;
        this.patient = patient;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVitalSign() {
        return vitalSign;
    }

    public void setVitalSign(String nameVitalSign) {
        this.vitalSign = nameVitalSign;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    @Override
    public String toString() {
        return "VitalSign{" +
                "id=" + id +
                ", vitalSign='" + vitalSign + '\'' +
                ", valor=" + valor +
                ", patient=" + patient +
                '}';
    }
}
