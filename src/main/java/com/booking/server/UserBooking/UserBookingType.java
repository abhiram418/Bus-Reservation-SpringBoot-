package com.booking.server.UserBooking;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserBookingType {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int bookingId;
    private String userName;
    private int busNumber;

    
    public int getBookingId() {
        return bookingId;
    }
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getBusNumber() {
        return busNumber;
    }
    public void setBusNumber(int busNumber) {
        this.busNumber = busNumber;
    }
}
