package com.backend.schoolsystem.entity;

import com.backend.schoolsystem.entity.enums.CurriculumType;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String subject_name;
    private String description;

    @Enumerated(EnumType.STRING)
    private CurriculumType curriculumType; //CBC or 8-4-4
    private String category; //academic based or interested based


    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    @PrePersist
    protected void onCreate() {
        created_at = LocalDateTime.now();
    }
}
