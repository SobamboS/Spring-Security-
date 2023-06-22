package com.example.springsecurity.config;

import com.example.springsecurity.UserEntity;
import com.example.springsecurity.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class UserInfoUserDetailsService implements UserDetailsService{

    UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
       Optional<UserEntity> userDetails =  userRepository.findByName(username);
        return null;
    }
}
