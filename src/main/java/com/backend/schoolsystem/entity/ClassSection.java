package com.backend.schoolsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.Year;


@Entity
@NoArgsConstructor
@AllArgsConstructor
public class ClassSection extends BaseEntity {


    private String sectionName;

    @ManyToOne
    private GradeLevel gradeLevel;

    @ManyToOne
    private Tutor tutor;
    private Year academicYear;


}
