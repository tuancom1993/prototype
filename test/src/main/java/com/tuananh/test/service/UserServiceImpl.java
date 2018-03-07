package com.tuananh.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuananh.test.entity.User;
import com.tuananh.test.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;
    
    @Override
    public void init() {
        User user = new User();
        user.setUsername("acton");
        user.setPassword("123");
        user.setRole(1);
        user.setFullName("Tuan Anh");
        userRepository.save(user);
    }

}
