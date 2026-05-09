package com.backend.schoolsystem.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Term extends BaseEntity{

    private Long academicYearId;
    private String termName;
    private Boolean isCurrent;
}
