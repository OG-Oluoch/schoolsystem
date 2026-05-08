package com.backend.schoolsystem.entity.enums;

import com.backend.schoolsystem.entity.BaseEntity;

import java.time.LocalDate;
import java.time.Year;

public class AcademicYear extends BaseEntity {

    private Year yearName;
    private LocalDate startDate;
    private LocalDate endDate;
    private Boolean isCurrent;
}
