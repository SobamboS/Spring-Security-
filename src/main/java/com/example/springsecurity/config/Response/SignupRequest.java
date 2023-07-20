package com.example.springsecurity.config.Response;

import lombok.Data;

@Data
public class SignupRequest{
    private String username, email, password;
}
