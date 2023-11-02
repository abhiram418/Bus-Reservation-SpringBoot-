package com.booking.server.BusData;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BusDataType {
    
    @Id
    private int busNumber;
    private String non_or_ac;
    private int price;
    private String fromPlace;
    private String fromTime;
    private String toPlace;
    private String toTime;


    
    public int getBusNumber() {
        return busNumber;
    }
    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }
    public String getNon_or_ac() {
        return non_or_ac;
    }
    public void setNon_or_ac(String non_or_ac) {
        this.non_or_ac = non_or_ac;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getFromPlace() {
        return fromPlace;
    }
    public void setFromPlace(String fromPlace) {
        this.fromPlace = fromPlace;
    }
    public String getFromTime() {
        return fromTime;
    }
    public void setFromTime(String fromTime) {
        this.fromTime = fromTime;
    }
    public String getToPlace() {
        return toPlace;
    }
    public void setToPlace(String toPlace) {
        this.toPlace = toPlace;
    }
    public String getToTime() {
        return toTime;
    }
    public void setToTime(String toTime) {
        this.toTime = toTime;
    }
}
