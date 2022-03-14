package com.codegym.springusermanagement.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min=5, max=45, message = "Bắt buộc phải nhập tên có từ 5-45 ký tự")
    private String firstName;

    @NotNull
    @Size(min=5, max=45, message = "Bắt buộc phải nhập họ có từ 5-45 ký tự")
    private String lastName;

    @Pattern(regexp = "^(84|0[3|5|7|8|9])+([0-9]{8})", message="Số điện thoại phải có dạng 03/05/07/08/09 và phải có 10 số!")
    private String phoneNumber;

    @Min(value = 18, message = "tuổi phải lớn hơn 18")
    private int age;

    @Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}",
            flags = Pattern.Flag.CASE_INSENSITIVE)
    String emailAddress;

    public User() {
    }

    public User(Long id, String firstName, String lastName, String phoneNumber, int age, String emailAddress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.emailAddress = emailAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
