package com.booking.server.Profile;

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
@RequestMapping("/profile")
@CrossOrigin( origins = "http://localhost:4200")
public class ProfileController {
    @Autowired
    RepProfile userData;
    
    @GetMapping("/{username}")
    @ResponseBody
    public Optional<ProfileType> getUserProfile(@PathVariable("username") String username){
        return(userData.findById(username));
    }

    @PostMapping("/")
    @ResponseBody
    public ProfileType postMethodName(@RequestBody ProfileType data) {
        return (userData.save(data));
    }
    
}
