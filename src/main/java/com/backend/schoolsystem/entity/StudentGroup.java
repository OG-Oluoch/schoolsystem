package com.backend.schoolsystem.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Entity
@NoArgsConstructor
@AllArgsConstructor
public class StudentGroup extends BaseEntity{

    private Long studentIdFk;
    private Long academicYearIdFk;
    private String role; // member,captain,secretary
    private LocalDateTime joinedDate;
    private LocalDateTime leftDate;
    private String status;
}
