package com.example.springsecurity.config.Response;

import lombok.Data;

@Data
public class LoginRequest{
    private String username;
    private String password;
}
