package com.tuananh.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import com.tuananh.test.service.UserService;

@SpringBootApplication
public class TestApplication {

    @Autowired
    UserService userService;
    
	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void init() {
	    userService.init();
	}
}
