package com.example.springsecurity.config.repo;

import com.example.springsecurity.config.model.ERole;
import com.example.springsecurity.config.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Integer>{
    Optional<Role> findByName(ERole name);
}
