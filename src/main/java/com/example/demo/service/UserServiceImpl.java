package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.entity.UserRepo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.EntityManager;

/**
 * Created by Administrator on 2017/8/2.
 */
@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserRepo  userRepo;
    @Resource
    private EntityManager  entityManager;
    public User  findUserById(String name){



      return userRepo.findByName(name);
    }
    public void saveUser(User user){

        Object str = entityManager.createNativeQuery("select id,name,password from User where name='张三'").getFirstResult();
        System.out.println(str.toString());
    }
}
