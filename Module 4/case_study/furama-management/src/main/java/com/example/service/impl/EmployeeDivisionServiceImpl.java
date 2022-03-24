package com.example.service.impl;

import com.example.model.person.EmployeeDivision;
import com.example.repository.employee.IEmployeeDivisionRepository;
import com.example.service.IEmployeeDivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeDivisionServiceImpl implements IEmployeeDivisionService {
    @Autowired
    private IEmployeeDivisionRepository employeeDivisionRepository;
    @Override
    public List<EmployeeDivision> findAll() {
        return employeeDivisionRepository.findAll();
    }
}
