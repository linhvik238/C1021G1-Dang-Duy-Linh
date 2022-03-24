package com.example.model.person;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.*;

public class EmployeeDto implements Validator {

    private Long employeeId;
    private Boolean gender;
    @Size(min = 4, max = 50, message = "name must have at least 4 words")
    private String name;
    private String birthday;
    @Pattern(regexp="^[0-9]{12}$", message = "Id card must be in 12 numbers")
    private String idCard;
    @Pattern(regexp="^(03|07|09)[0-9]{8}$", message = "phone must follow (03|07|09-xxxx-xxxx) format ")
    private String phone;
    @Email
    private String email;
    @NotBlank
    @Size(min = 15, max = 100, message = "Address must have at least 15 words")
    private String address;
    @Pattern(regexp = "^(NV-)[0-9]{4}$", message = "employee code must follow (NV-xxxx) format ")
    private String code;
    private Integer salary;
    private EmployeeEducationDegree employeeEducationDegree;
    private EmployeeDivision employeeDivision;
    private EmployeePosition employeePosition;

    public EmployeeDto() {
    }

    public EmployeeDto(Boolean gender, String name, String birthday, String idCard, String phone, String email, String address, String code, Integer salary) {
        this.gender = gender;
        this.name = name;
        this.birthday = birthday;
        this.idCard = idCard;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.code = code;
        this.salary = salary;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
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

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public EmployeeEducationDegree getEmployeeEducationDegree() {
        return employeeEducationDegree;
    }

    public void setEmployeeEducationDegree(EmployeeEducationDegree employeeEducationDegree) {
        this.employeeEducationDegree = employeeEducationDegree;
    }

    public EmployeeDivision getEmployeeDivision() {
        return employeeDivision;
    }

    public void setEmployeeDivision(EmployeeDivision employeeDivision) {
        this.employeeDivision = employeeDivision;
    }

    public EmployeePosition getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(EmployeePosition employeePosition) {
        this.employeePosition = employeePosition;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
