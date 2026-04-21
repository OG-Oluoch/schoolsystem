package com.backend.schoolsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Subject {

    private Long id;
    private String subject_name;
    private String description;

    @Enumerated(EnumType.STRING)
    private CurriculumType curriculumType; //CBC or 8-4-4
    private String category; //academic based or interested based
    private Integer credits;

    @OneToMany
    private List<TeacherSpecialization> teacherSpecializationList;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    @PrePersist
    protected void onCreate() {
        created_at = LocalDateTime.now();
    }
}
