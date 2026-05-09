package com.backend.schoolsystem.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Assessment extends BaseEntity{

    private Long academicYearId;
    private Long createdById;
    private Long termId;
    private String examType; // cat, middle term, final
    private LocalDate startDate;
    private LocalDate endDate;
    private String status; // scheduled, ongoing, completed

}
