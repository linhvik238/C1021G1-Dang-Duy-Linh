package com.example.model.person;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class EmployeeEducationDegree {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idEducationDegree;
    private String nameEducationDegree;

    @OneToMany (mappedBy = "employeeEducationDegree", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Employee> employeeSet;

    public EmployeeEducationDegree() {
    }

    public EmployeeEducationDegree(int idEducationDegree, String nameEducationDegree) {
        this.idEducationDegree = idEducationDegree;
        this.nameEducationDegree = nameEducationDegree;
    }

    public int getIdEducationDegree() {
        return idEducationDegree;
    }

    public void setIdEducationDegree(int idEducationDegree) {
        this.idEducationDegree = idEducationDegree;
    }

    public String getNameEducationDegree() {
        return nameEducationDegree;
    }

    public void setNameEducationDegree(String nameEducationDegree) {
        this.nameEducationDegree = nameEducationDegree;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }
}
