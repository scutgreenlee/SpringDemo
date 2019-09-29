package com.example.demo.Service;

import com.example.demo.DAO.UserDao;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userRepository;
    public User findUserByName(String username){
        return userRepository.findByUsername(username);
    }
}
