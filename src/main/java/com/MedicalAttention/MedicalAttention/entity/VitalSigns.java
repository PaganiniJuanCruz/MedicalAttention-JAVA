package com.MedicalAttention.medicalAttention.entity;

public class VitalSigns {
    private Integer pulsations;
    private Float bloodPressure;

    public VitalSigns (){
    }

    public VitalSigns(Integer pulsations, Float bloodPressure) {
        this.pulsations = pulsations;
        this.bloodPressure = bloodPressure;
    }

    public Integer getPulsations() {
        return pulsations;
    }

    public void setPulsations(Integer pulsations) {
        this.pulsations = pulsations;
    }

    public Float getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(Float bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    @Override
    public String toString() {
        return "VitalSigns{" +
                "pulsations=" + pulsations +
                ", bloodPressure=" + bloodPressure +
                '}';
    }
}
