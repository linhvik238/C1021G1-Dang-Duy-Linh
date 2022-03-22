package com.example.model.person;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Set;

@Entity
public class EmployeePosition {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idPosition;
    private String namePosition;
    @OneToMany(mappedBy = "employeePosition", cascade = CascadeType.ALL)
    @JsonManagedReference
    private Set<Employee> employeeSet;

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }

    public EmployeePosition() {
    }

    public EmployeePosition(Long idPosition, String namePosition) {
        this.idPosition = idPosition;
        this.namePosition = namePosition;
    }

    public Long getIdPosition() {
        return idPosition;
    }

    public void setIdPosition(Long idPosition) {
        this.idPosition = idPosition;
    }

    public String getNamePosition() {
        return namePosition;
    }

    public void setNamePosition(String namePosition) {
        this.namePosition = namePosition;
    }


}
