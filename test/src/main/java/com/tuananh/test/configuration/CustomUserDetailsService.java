package com.tuananh.test.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.tuananh.test.entity.User;
import com.tuananh.test.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		try {
			User user = userRepository.findOne(username);
			System.out.println("User find: " + user.getUsername());
			
			if (user == null) throw new UsernameNotFoundException("Cannot find user with username: "+username);
			
			return new CustomUserDetails(user);
		} catch (Exception e) {
			throw new UsernameNotFoundException("Cannot find user with username: "+username);
		}
	}

}
