package com.example.springsecurity.config.repo;

import com.example.springsecurity.config.model.SpringUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringUserRepository extends JpaRepository<SpringUser, Long>{

    Optional<SpringUser> findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
