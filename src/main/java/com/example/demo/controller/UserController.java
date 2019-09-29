package com.example.demo.controller;

import com.example.demo.Service.UserService;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
    @Autowired
    UserService userservice;
    @GetMapping("/{username}")
    public User getUser(@PathVariable("username")String username){
        return userservice.findUserByName(username);
    }
}
