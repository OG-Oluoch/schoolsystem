package com.backend.schoolsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    private GradeLevel gradeLevel;
    private Tutor tutor;
    private Year academicYear;
    private Integer noOfStudents;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
