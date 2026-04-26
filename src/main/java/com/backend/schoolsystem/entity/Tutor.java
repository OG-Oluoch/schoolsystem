package com.backend.schoolsystem.entity;

import com.backend.schoolsystem.entity.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer phoneNumber;
    private String subjectSpecialization;
    private Gender gender;
    private String status;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Tutor(Long id, String firstName, String lastName, String email, Integer phoneNumber, String subjectSpecialization, Gender gender, String status) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.subjectSpecialization = subjectSpecialization;
        this.gender = gender;
        this.status = status;
    }

    @PrePersist
    protected void onCreate() {
        createdAt = java.time.LocalDateTime.now();
    }
}
