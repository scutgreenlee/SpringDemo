package com.example.demo.Service;

import com.example.demo.DAO.UserDao;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserDao userRepository;
    public User findUserByName(String username){
        return userRepository.findByUsername(username);
    }
    public List<User> findAll(){
        return userRepository.findAll();
    }
    public User saveUser(User user){
        return userRepository.save(user);
    }
    public User findUserById(long id){
        return userRepository.findById(id).get();
    }
    public User updateUser(User user){
        return userRepository.saveAndFlush(user);
    }

    public void deleteUser(long id){
        if(userRepository.existsById(id))
            userRepository.deleteById(id);
        else System.out.println("不存在");
    }
}
