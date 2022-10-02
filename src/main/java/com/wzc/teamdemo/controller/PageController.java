package com.wzc.teamdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
    @RequestMapping("/")
    public String page(){
        return "login";
    }

    @ResponseBody
    @RequestMapping("/add")
    public String demo(){
        return "hello springboot";
    }
}
