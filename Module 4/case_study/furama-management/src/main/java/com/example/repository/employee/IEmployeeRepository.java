package com.example.repository.employee;

import com.example.model.person.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IEmployeeRepository extends JpaRepository<Employee, Long> {
}
