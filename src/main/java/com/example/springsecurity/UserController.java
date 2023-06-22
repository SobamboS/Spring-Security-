package com.example.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/products")
public class UserController{
@Autowired
    UserService userService;

@GetMapping("/welcome")
@PreAuthorize("hasAnyAuthority('ADMIN')")
    public String welcome(){
   return ("Welcome to Java");
}

@GetMapping("/What")
@PreAuthorize("hasAnyAuthority('USER')")
    public String what(){
    return ("What' your name");
}
}
