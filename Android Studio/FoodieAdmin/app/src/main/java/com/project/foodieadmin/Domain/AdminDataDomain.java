package com.project.foodieadmin.Domain;

import java.io.Serializable;

public class AdminDataDomain implements Serializable {
    private int id;
    private String name;
    private String phone;
    private String email;
    private String username;

    public AdminDataDomain() {
    }

    public AdminDataDomain(int id, String name, String phone, String email, String username) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
