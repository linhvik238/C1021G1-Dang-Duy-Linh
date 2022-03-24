package com.example.service.impl;

import com.example.model.person.EmployeeEducationDegree;
import com.example.repository.employee.IEmployeeEducationDegreeRepository;
import com.example.service.IEmployeeEducationDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeEducationDegreeServiceImpl implements IEmployeeEducationDegreeService {
    @Autowired
    private IEmployeeEducationDegreeRepository employeeEducationDegreeRepository;
    @Override
    public List<EmployeeEducationDegree> findAll() {
        return employeeEducationDegreeRepository.findAll();
    }
}
