package com.lanclass.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class UserController {

    @RequestMapping("/index")
    public String index(){
        return "你哈";
    }
}
