package com.example.springsecurity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class UserEntity{
    @Id
    private int Id;
    private String name;
    private String email;
    private String password;
    private String role;
}



