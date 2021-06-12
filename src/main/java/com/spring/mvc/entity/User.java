package com.spring.mvc.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="fullname")
    @NotBlank(message = "fullName must by not empty")
    @Size(min=2, max=25, message = "fullName should be between 2 and 25 characters")
    private String fullName;

    @Column(name="email")
    @NotBlank(message = "email must by not empty")
    @Size(min=12, max=25, message = "email should be between 12 and 25 characters")
    private String email;

    @Column(name="phone")
    @NotBlank(message = "phone must by not empty")
    @Size(min=4, max=11, message = "phone should be between 4 and 11 characters")
    private String phone;

    @Column(name="address")
    @NotBlank(message = "address must by not empty")
    @Size(min=10, max=50, message = "address should be between 10 and 50 characters")
    private String address;

    @Column(name="date_of_birth")
    @NotBlank(message = "dateOfBirth must by not empty")
    @Size(min=5, max=10, message = "dateOfBirth should be between 5 and 10 characters")
    private String dateOfBirth;

    public User() {
    }

    public User(int id, String fullName, String email, String phone, String address, String dateOfBirth) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
