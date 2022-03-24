package com.example.repository.employee;

import com.example.model.person.EmployeeDivision;
import net.bytebuddy.implementation.bytecode.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface IEmployeeDivisionRepository extends JpaRepository<EmployeeDivision, Long> {
}
