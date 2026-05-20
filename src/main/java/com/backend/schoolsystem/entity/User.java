package com.backend.schoolsystem.entity;

import com.backend.schoolsystem.entity.enums.EnumRole;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity{


    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private Integer phoneNumber;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;
    private LocalDateTime lastLogin;
    private Boolean isActive;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Tutor tutor;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Guardian guardian;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Student student;


}
