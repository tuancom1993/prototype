package com.tuananh.test.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    @Autowired
    CustomUserDetailsService customUserDetailsService;
    
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        http.formLogin()
        	.loginPage("/login").failureUrl("/login?error=true")
        	.usernameParameter("username")
        	.passwordParameter("password")
        	.successForwardUrl("/");
        http.authorizeRequests()
        	.antMatchers("/login").permitAll() 
        	.anyRequest().authenticated();
    }
    
    @Override
    public void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(customUserDetailsService);
    }
}
