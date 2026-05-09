package com.backend.schoolsystem.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class AssessmentResult extends BaseEntity{

    private Long assessmentIdFk;
    private Long studentIdFk;
    private Long subjectIdFk;
    private Long gradedById;
    private Long markObtained;
    private String grade;
    private Long gradePoints;
    private String isAbsent;
    private String remarks;
}
