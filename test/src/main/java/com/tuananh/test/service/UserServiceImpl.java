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
        user.setUsername("admin");
        user.setPassword("admin");
        user.setRole(1);
        user.setFullName("Tuan Anh Admin");
        userRepository.save(user);
        
        user = new User();
        user.setUsername("user");
        user.setPassword("user");
        user.setRole(2);
        user.setFullName("Tuan Anh User");
        userRepository.save(user);
    }

}
