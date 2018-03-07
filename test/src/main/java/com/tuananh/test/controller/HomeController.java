package com.tuananh.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.tuananh.test.service.UserService;

@Controller
public class HomeController {
    @Autowired
    UserService userService;
    
    @GetMapping("/")
    public String showHome() {
        userService.init();
        return "home";
    }
}
