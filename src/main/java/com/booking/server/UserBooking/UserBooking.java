package com.booking.server.UserBooking;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/userbookings")
@CrossOrigin( origins = "http://localhost:4200")
public class UserBooking {
    @Autowired
    RepUserBookings bookings;

    @GetMapping("/{username}")
    @ResponseBody
    public List<UserBookingType> getAllBookings(@PathVariable("username") String username){
        return(bookings.findByUserName(username));
    }

    @PostMapping("/")
    @ResponseBody
    public UserBookingType postTheBooking(@RequestBody UserBookingType data){
        return(bookings.save(data));
    }
}
