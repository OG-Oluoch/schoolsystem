package com.backend.schoolsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class GradeLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String gradeName;
    private String description;
    private String levelOrder; // for sorting
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
