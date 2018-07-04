package com.example.demo.controller;

import com.example.demo.entity.AppUser;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by matashrazm on 7/4/2018.
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("users")
    public List<AppUser> getUsers() {

       return userRepository.findAll();
    }

    @PostMapping("add_user")
    public AppUser createUser(@RequestBody AppUser user) {
        AppUser createdUser = userRepository.save(user);
        return createdUser;
    }
}
