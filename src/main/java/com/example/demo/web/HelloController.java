package com.example.demo.web;

import com.example.demo.entity.User;
import com.example.demo.service.UserServiceImpl;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;


@EnableAutoConfiguration
@Controller

public class HelloController {
    @Resource
    private UserServiceImpl  userService;


    @RequestMapping("hello/{name}")
    public ModelAndView toIndex(@PathVariable(value="name") String name){
        System.out.println(name);
        User user = userService.findUserById(name);
        System.out.println(user.toString());
        return  new ModelAndView("index1","number",user.toString());
    }
    @RequestMapping("vm/{myName}")
    public String findIndex(@PathVariable(value="myName") String myName, Model model){
        User  user = new User();
        user.setName(myName);
        userService.saveUser(user);
        model.addAttribute("name",myName);
        System.out.println(myName);
        return  "index1";
    }
}
