package com.backend.schoolsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.Year;

@Data
@Entity
public class ClassSection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sectionName;

    @ManyToOne
    private GradeLevel gradeLevel;

    @ManyToOne
    private Tutor tutor;
    private Year academicYear;
    private Integer noOfStudents;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
