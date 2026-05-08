package com.backend.schoolsystem.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Year;

@Entity
@NoArgsConstructor
@AllArgsConstructor

public class AcademicYear extends BaseEntity {

    private Year yearName;
    private LocalDate startDate;
    private LocalDate endDate;
    private Boolean isCurrent;
}
