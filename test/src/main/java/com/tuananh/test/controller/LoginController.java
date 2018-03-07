package com.tuananh.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String showLogIn() {
		return "login";
	}
	
	@PostMapping("/login")
	public String doLogin() { 
		return "login";
	}
}
