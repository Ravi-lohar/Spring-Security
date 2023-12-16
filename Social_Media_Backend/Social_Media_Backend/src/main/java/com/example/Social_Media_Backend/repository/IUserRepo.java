package com.example.Social_Media_Backend.repository;

import com.example.Social_Media_Backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User, Long> {

    User findByUserName(String username);
}
