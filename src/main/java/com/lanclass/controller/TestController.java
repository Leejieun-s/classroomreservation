package com.lanclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 *
 * @Date: 2023/01/05/21:47
 */

@Controller
@RequestMapping("/hello1")
public class TestController {

    @GetMapping("/index")
    @ResponseBody
    public String test(){
        return "test";
    }

}
