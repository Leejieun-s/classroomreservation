package com.lanclass.controller;

import com.lanclass.entity.User;
import com.lanclass.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/hello")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/all")
    public List<User> findalluser(){
        List<User> users = userService.findalluser();
        return users;
    }

    @RequestMapping("/index")
    public String index(){
        return "你哈";
    }

}
