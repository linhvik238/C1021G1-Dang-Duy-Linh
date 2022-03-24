package com.example.service;

import com.example.model.person.Customer;
import com.example.model.person.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IEmployeeService {
    Page<Employee> employeeList(Pageable pageable);
    void save(Employee employee);
    Optional<Employee> findById(Long id);
    void deleteEmployee(Employee employee);
}
