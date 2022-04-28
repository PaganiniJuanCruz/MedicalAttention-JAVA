package com.MedicalAttention.MedicalAttention.repository;

import com.MedicalAttention.MedicalAttention.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, String> {
}
