package com.backend.schoolsystem.entity;

import com.backend.schoolsystem.entity.enums.Role;
import jakarta.persistence.Entity;

import java.time.LocalDateTime;

@Entity
public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private Integer phoneNumber;
    private String password;
    private Role role;
    private Boolean isActive;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
