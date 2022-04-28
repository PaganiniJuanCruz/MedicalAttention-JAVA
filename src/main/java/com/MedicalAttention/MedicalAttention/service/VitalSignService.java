package com.MedicalAttention.MedicalAttention.service;

import com.MedicalAttention.MedicalAttention.entity.Patient;
import com.MedicalAttention.MedicalAttention.entity.VitalSign;
import com.MedicalAttention.MedicalAttention.repository.VitalSignRepository;
import com.MedicalAttention.MedicalAttention.responseDTO.VitalSignDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VitalSignService {
    @Autowired
    private VitalSignRepository vitalSignRepository;
    // GETTERS
    public List<VitalSignDTO> getVitalSigns(){
        return vitalSignRepository.findAll()
                .stream()
                .map(VitalSignDTO::new)
                .collect(Collectors.toList());
    }

    public List<VitalSignDTO> getVitalSignsByPatient(Patient patient){
        return vitalSignRepository.findByPatient(patient)
                .stream()
                .map(VitalSignDTO::new)
                .collect(Collectors.toList());
    }
    // UPDATE VITAL SIGNS
    public List<VitalSignDTO> updateVitalSigns(VitalSign vitalSign, Integer id){
        VitalSign sv = vitalSignRepository.findById(id).orElse(null);
        if(sv != null){
            sv.setVitalSign(vitalSign.getVitalSign());
            sv.setValor(vitalSign.getValor());
            sv = vitalSignRepository.save(sv);
            return sv.getPatient().getVitalSigns()
                    .stream()
                    .map(VitalSignDTO::new)
                    .collect(Collectors.toList());
        }
        return null;
    }
    // DELETE VITAL SIGNS
    public void deleteVitalSign(Integer id){
        VitalSign vs = vitalSignRepository.findById(id).orElse(null);
        if(vs != null)
            vitalSignRepository.deleteById(id);
    }
}