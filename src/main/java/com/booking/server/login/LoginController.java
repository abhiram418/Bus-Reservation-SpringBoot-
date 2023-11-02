package com.booking.server.login;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/user")
@CrossOrigin( origins = "http://localhost:4200")
public class LoginController {
    
    @Autowired
    private Rep repository;


    @GetMapping("/login/{userName}")
    @ResponseBody
    public Boolean getMethodName(@PathVariable("userName") String userName,@RequestParam("key") String key) {
        String password = repository.findPasswordByUsername(userName);
        String passWord = key;
        if(password.equals(passWord)){
            return true;
        }
        else{
            return false;
        }
    }

    @PostMapping("/signup")
    @ResponseBody
    public LoginType putMethodName(@RequestBody LoginType data ) {
        return repository.save(data);
    }

    @GetMapping("/signup/{username}")
    @ResponseBody
    public Boolean checkCredentials(@PathVariable("username") String username) {
        return repository.existsById(username);
    }
}
