package com.booking.server.BusSeats;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/seats")
@CrossOrigin( origins = "http://localhost:4200")
public class BusSeats {
    
    @Autowired
    RepBusSeats repository;

    @GetMapping("/{busNumber}")
    @ResponseBody
    public Optional<BusSeatsType> getMethodName(@PathVariable("busNumber") int busNumber) {
        return(repository.findById(busNumber));
    }
    
    @PostMapping("/")
    @ResponseBody
    public BusSeatsType postBusSeats(@RequestBody BusSeatsType data){
        return(repository.save(data));
    }
}
