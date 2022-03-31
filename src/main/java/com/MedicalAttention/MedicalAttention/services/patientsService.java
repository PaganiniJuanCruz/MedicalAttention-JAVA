package com.MedicalAttention.medicalAttention.services;

import com.MedicalAttention.medicalAttention.entity.Patients;

import java.util.List;

public interface patientsService {
    List<Patients> getPatients();
    List<Patients> postPatients(Patients patients);
}
