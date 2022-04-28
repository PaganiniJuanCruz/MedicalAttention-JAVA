package com.MedicalAttention.MedicalAttention.repository;

import com.MedicalAttention.MedicalAttention.entity.Patient;
import com.MedicalAttention.MedicalAttention.entity.VitalSign;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface VitalSignRepository extends CrudRepository<VitalSign, Integer> {
    public List<VitalSign> findAll();

    public List<VitalSign> findByPatient(Patient patient);
}
