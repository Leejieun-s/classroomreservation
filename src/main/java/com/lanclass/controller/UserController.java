package com.lanclass.controller;

import com.lanclass.entity.User;
import com.lanclass.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags = "用户管理")
@RestController
@RequestMapping(value = "/hello")
public class UserController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "查询所有用户")
    @RequestMapping("/all")
    public List<User> findalluser(){
        return userService.findalluser();
    }

    @RequestMapping("/index")
    public String index(){
        return "你哈";
    }

    @ApiOperation(value = "指定用户")
    @GetMapping("/search")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "用户姓名", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "age", value = "用户年龄", required = true, dataType = "int", paramType = "query")
    })
    public String sercch(String name,Integer age){
        return name+age;
    }
}
