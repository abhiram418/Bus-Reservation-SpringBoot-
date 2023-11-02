package com.booking.server.Profile;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ProfileType {

    @Id
    private String userName;
    private String name;
    private String phNo;
    private String gender;

    
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhNo() {
        return phNo;
    }
    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
}
