package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,unique = true)
    private String username;
    @Column
    private  String passwd;
    @Override
    public String toString(){
        return "Userinfo{"+
                "id="+id+
                ",username='"+username+'\''+
                ",password='"+passwd+'\''+
                '}';
    }
}
