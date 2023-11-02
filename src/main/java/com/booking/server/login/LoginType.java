package com.booking.server.login;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoginType {

    @Id
    private String userName;
    private String password;

    
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
