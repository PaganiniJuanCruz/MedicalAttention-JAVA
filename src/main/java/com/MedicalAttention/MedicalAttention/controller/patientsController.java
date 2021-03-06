package com.MedicalAttention.medicalAttention.controller;

import com.MedicalAttention.medicalAttention.entity.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("apiPatients")
public class patientsController {
    @Autowired
    private com.MedicalAttention.medicalAttention.repository.PatientRepository patientRepository;

    @GetMapping("/patients")
    List<Patients> getPatients() {
        return (List<Patients>) patientRepository.findAll();
    }
    @PostMapping("/patients/{id}")
    Patients postPatient(@RequestBody Patients patient){
        return patientRepository.save(patient);
    }
}
