package com.MedicalAttention.MedicalAttention.responseDTO;

public class VitalSignDTO {
    private Integer id;
    private String vitalSign;
    private Integer value;

    public VitalSignDTO() {
    }

    public VitalSignDTO(com.MedicalAttention.medicalAttention.entity.VitalSign vitalSigns) {
        this.id = vitalSign.getId();
        this.vitalSign = vitalSign.getVitalSign();
        this.value = vitalSign.getValor();
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

    public void setVitalSign(String vitalSign) {
        this.vitalSign = vitalSign;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer valor) {
        this.value = valor;
    }
}

