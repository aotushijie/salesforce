package com.company.dao.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String username;
    private String Password;

    public User() {
    }

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        Password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", Password='" + Password + '\'' +
                '}';
    }
}
