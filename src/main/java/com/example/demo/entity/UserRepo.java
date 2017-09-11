package com.example.demo.entity;


import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2017/8/2.
 */
public interface UserRepo extends JpaRepository<User,String>{
    public User findByName(String name);
}
