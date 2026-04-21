package com.backend.schoolsystem.entity;

import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

public class StudentEnrollment {

    @ManyToOne
    private Student student;

    @ManyToOne
//    private ClassEntity currentClass;
    private CurriculumType curriculumType;
    private String nemisNumber;
    private LocalDate enrollmentDate;
}
