package com.example.Social_Media_Backend.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/userDetails")
    public String getDetails(){
        return "Welcome to User Home" ;
    }

    @GetMapping("/adminDetails")
    public String get(){
        return "Welcome to Admin Home" ;
    }

    @GetMapping("/public")
    public String fetch(){
        return "Taking" ;
    }
}
