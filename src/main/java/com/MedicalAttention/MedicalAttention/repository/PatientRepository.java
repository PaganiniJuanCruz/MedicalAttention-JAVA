package com.MedicalAttention.medicalAttention.repository;

import com.MedicalAttention.medicalAttention.entity.Patients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository <Patients, Long>{
}
