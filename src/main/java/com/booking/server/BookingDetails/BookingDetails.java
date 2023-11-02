package com.booking.server.BookingDetails;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/bookingDetails")
@CrossOrigin( origins = "http://localhost:4200")
public class BookingDetails {

    @Autowired
    RepBookingDetails repository;

    @GetMapping("/{bookingId}")
    @ResponseBody
    public Optional<BookingDetailsType> getBookingsDetails(@PathVariable("bookingId") int bookingId){
        return(repository.findById(bookingId));
    }
    
    @PostMapping("/")
    public BookingDetailsType postMethodName(@RequestBody BookingDetailsType data) {
        return(repository.save(data));
    }
    
}
