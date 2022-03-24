package com.example.model.person;

import com.example.model.login.Username;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private Boolean gender;
    private String name;
    private String birthday;
    private String idCard;
    private String phone;
    private String email;
    private String address;
    private String code;
    private Integer salary;
    @ManyToOne
    @JoinColumn(name = "position_id", referencedColumnName = "idPosition")
    @JsonBackReference
    private EmployeePosition employeePosition;

    @ManyToOne
    @JoinColumn(name = "division_id", referencedColumnName = "idDivision")
    @JsonBackReference
    private EmployeeDivision employeeDivision;

    @ManyToOne
    @JoinColumn(name = "education_degree_id", referencedColumnName = "idEducationDegree")
    @JsonBackReference
    private EmployeeEducationDegree employeeEducationDegree;

    @OneToOne
    @JoinColumn (name = "username", referencedColumnName = "username")
    private Username username;


    public Employee() {
    }

    public Employee(Boolean gender, String name, String birthday, String idCard, String phone, String email, String address, String code, Integer salary, EmployeePosition employeePosition, EmployeeDivision employeeDivision, EmployeeEducationDegree employeeEducationDegree) {
        this.gender = gender;
        this.name = name;
        this.birthday = birthday;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.code = code;
        this.salary = salary;
        this.employeePosition = employeePosition;
        this.employeeDivision = employeeDivision;
        this.employeeEducationDegree = employeeEducationDegree;
    }

    public Username getUsername() {
        return username;
    }

    public void setUsername(Username username) {
        this.username = username;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public EmployeePosition getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(EmployeePosition employeePosition) {
        this.employeePosition = employeePosition;
    }

    public EmployeeDivision getEmployeeDivision() {
        return employeeDivision;
    }

    public void setEmployeeDivision(EmployeeDivision employeeDivision) {
        this.employeeDivision = employeeDivision;
    }

    public EmployeeEducationDegree getEmployeeEducationDegree() {
        return employeeEducationDegree;
    }

    public void setEmployeeEducationDegree(EmployeeEducationDegree employeeEducationDegree) {
        this.employeeEducationDegree = employeeEducationDegree;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
