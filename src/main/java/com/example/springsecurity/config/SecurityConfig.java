package com.example.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

    @Bean
    //authentication
    public UserDetailsService userDetailsService (PasswordEncoder encoder){
//        UserDetails admin =  User.withUsername("Olusola")
//                .password(encoder.encode("Olusola"))
//                .roles("ADMIN")
//                .build();
//        UserDetails user = User.withUsername("User1")
//                .password("user")
//                .roles("User")
//                .build();
//        return new InMemoryUserDetailsManager(admin,user);
        return new UserInfoUserDetailsService();
    }
    @Bean
    //authorization
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
      return   http.csrf().disable()
                .authorizeHttpRequests()
                .requestMatchers("/products/welcome").permitAll()
                .and()
                .authorizeHttpRequests().requestMatchers("products/**").authenticated()
                .and().formLogin()
                .and().build();

    }


    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
