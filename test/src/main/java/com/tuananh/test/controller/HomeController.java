package com.tuananh.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.tuananh.test.service.UserService;

@Controller
public class HomeController {
    @Autowired
    UserService userService;
    
    @GetMapping({"/", "/home"})
    public String showHome() {
        userService.init();
        return "home";
    }
    
    @GetMapping("/admin")
    public String showAdmin() {
        return "admin";
    }
    
    @GetMapping("/user")
    public String showUser() {
        return "user";
    }
}
