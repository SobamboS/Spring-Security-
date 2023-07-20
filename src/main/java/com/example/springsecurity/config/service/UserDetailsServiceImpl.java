package com.example.springsecurity.config.service;

import com.example.springsecurity.config.model.SpringUser;
import com.example.springsecurity.config.model.UserDetailsImpl;
import com.example.springsecurity.config.repo.SpringUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.transaction.annotation.Transactional;

public class UserDetailsServiceImpl implements UserDetailsService{
    @Autowired
    SpringUserRepository springUserRepository;


    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SpringUser user = springUserRepository.findByUsername(username)
                .orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

        return UserDetailsImpl.build(user);
    }


}
