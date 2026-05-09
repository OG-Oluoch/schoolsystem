package com.backend.schoolsystem.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class CalendarEvent extends BaseEntity{

    private Long academicYearId;
    private Long termId;
    private Long gradeLevelId;
    private Long examId;
    private String title;
    private String description;
    private String eventType;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String location;
    private Long createdById;

}
