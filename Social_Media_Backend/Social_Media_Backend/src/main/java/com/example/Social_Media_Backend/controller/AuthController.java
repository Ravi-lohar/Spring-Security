package com.example.Social_Media_Backend.controller;

import com.example.Social_Media_Backend.model.User;
import com.example.Social_Media_Backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    UserService userService ;

    @PostMapping("/create")
    public String createUser(@RequestBody User user){
        return userService.createUser(user);
    }


}
