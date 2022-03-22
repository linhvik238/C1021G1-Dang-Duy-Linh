package com.example.model.person;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class EmployeeDivision {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idDivision;
    private String nameDivision;

    @OneToMany (mappedBy = "employeeDivision", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Employee> employeeSet;

    public EmployeeDivision() {
    }

    public EmployeeDivision(int idDivision, String nameDivision) {
        this.idDivision = idDivision;
        this.nameDivision = nameDivision;
    }

    public int getIdDivision() {
        return idDivision;
    }

    public void setIdDivision(int idDivision) {
        this.idDivision = idDivision;
    }

    public String getNameDivision() {
        return nameDivision;
    }

    public void setNameDivision(String nameDivision) {
        this.nameDivision = nameDivision;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }
}
