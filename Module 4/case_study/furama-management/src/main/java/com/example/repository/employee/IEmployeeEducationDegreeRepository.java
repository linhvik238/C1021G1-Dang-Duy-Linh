package com.example.repository.employee;

import com.example.model.person.EmployeeEducationDegree;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IEmployeeEducationDegreeRepository extends JpaRepository<EmployeeEducationDegree, Long> {
}
