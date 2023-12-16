package com.example.Social_Media_Backend.service;

import com.example.Social_Media_Backend.model.User;
import com.example.Social_Media_Backend.repository.IUserRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private IUserRepo userRepo ;

    public User findByUserName(String username) {
        return userRepo.findByUserName(username);
    }

    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Transactional
    public String createUser(User user) {
        String encryptedPassword = bCryptPasswordEncoder().encode(user.getPassword());
        user.setPassword(encryptedPassword);
        userRepo.save(user);
        return "Saved" ;
    }
}
