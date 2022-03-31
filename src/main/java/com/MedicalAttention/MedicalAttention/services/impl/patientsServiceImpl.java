package com.MedicalAttention.medicalAttention.services.impl;

import com.MedicalAttention.medicalAttention.entity.Patients;
import com.MedicalAttention.medicalAttention.repository.patientRepository;
import com.MedicalAttention.medicalAttention.services.patientsService;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class patientsServiceImpl implements patientsService {
    private final patientRepository patientRepository;

    @Override
    public List<Patients> getPatients(){
        return patientRepository.findAll();
    }
    @Override
    public List<Patients> postPatients(Patients patient){
        return (List<Patients>) patientRepository.save(patient);
    }

    }

