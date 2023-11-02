package com.booking.server.BusData;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/bus")
@Controller
@CrossOrigin( origins = "http://localhost:4200")
public class BusData {
    
    @Autowired
    RepBusData reposetory;


    @GetMapping("/{busNumber}")
    @ResponseBody
    public Optional<BusDataType> getBusData(@PathVariable("busNumber") int busNumber){
        return(reposetory.findById(busNumber));
    }

    @PostMapping("/")
    @ResponseBody
    public BusDataType postBusData(@RequestBody BusDataType data){
        return(reposetory.save(data));
    }

    @GetMapping("/")
    @ResponseBody
    public List<BusDataType> getAllBusses(){
        return(reposetory.findAll());
    }
}
