package com.example.springsecurity.config.Response;

import com.example.springsecurity.config.model.Role;
import lombok.Data;

@Data
public class JwtResponse{
       private String token;
       private String type;
        private Long id;
        private String username;
        private String email;
        private Role roles;

    public JwtResponse(String token,String type,Long id,String username,String email,Role roles){
        this.token=token;
        this.id=id;
        this.username=username;
        this.email=email;
        this.roles=roles;
        this.type=type;
    }
}
