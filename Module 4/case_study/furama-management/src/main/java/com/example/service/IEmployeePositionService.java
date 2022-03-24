package com.example.service;

import com.example.model.person.EmployeeDivision;
import com.example.model.person.EmployeePosition;

import java.util.List;

public interface IEmployeePositionService {
    List<EmployeePosition> findAll();
}
