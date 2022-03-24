package com.example.service.impl;


import com.example.model.person.EmployeePosition;
import com.example.repository.employee.IEmployeePositionRepository;
import com.example.service.IEmployeePositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeePositionServiceImpl implements IEmployeePositionService {
    @Autowired
    private IEmployeePositionRepository employeePositionRepository;

    @Override
    public List<EmployeePosition> findAll() {
        return employeePositionRepository.findAll();
    }
}
