package com.booking.server.BookingDetails;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;


@Entity
public class BookingDetailsType {
    
    @Id
    private int bookingId;
    @ElementCollection
    @CollectionTable(
        name="PasengersType",
        joinColumns=@JoinColumn(name="ind")
    )

    private List<PasengersType> pasengers;
    @ElementCollection
    private List<Integer> seatsReserved;


    public int getBookingId() {
        return bookingId;
    }
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
    public List<PasengersType> getPasengers() {
        return pasengers;
    }
    public void setPasengers(List<PasengersType> pasengers) {
        this.pasengers = pasengers;
    }
    public List<Integer> getSeatsReserved() {
        return seatsReserved;
    }
    public void setSeatsReserved(List<Integer> seatsReserved) {
        this.seatsReserved = seatsReserved;
    }
}
