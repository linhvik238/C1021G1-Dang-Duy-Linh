package com.example.repository.employee;

import com.example.model.person.EmployeePosition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmployeePositionRepository extends JpaRepository<EmployeePosition, Long> {
}
