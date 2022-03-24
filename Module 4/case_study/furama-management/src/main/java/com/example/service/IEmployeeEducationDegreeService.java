package com.example.service;

import com.example.model.person.EmployeeDivision;
import com.example.model.person.EmployeeEducationDegree;

import java.util.List;

public interface IEmployeeEducationDegreeService {
    List<EmployeeEducationDegree> findAll();
}
