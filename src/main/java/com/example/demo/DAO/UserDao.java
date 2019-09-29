package com.example.demo.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.User;

public interface UserDao extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
