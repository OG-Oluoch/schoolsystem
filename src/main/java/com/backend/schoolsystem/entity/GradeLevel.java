package com.backend.schoolsystem.entity;

import jakarta.persistence.Entity;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class GradeLevel {

    private Long id;
    private String gradeName;
    private String description;
    private String levelOrder; // for sorting
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
