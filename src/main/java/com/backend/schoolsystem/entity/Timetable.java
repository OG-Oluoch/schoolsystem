package com.backend.schoolsystem.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Timetable extends BaseEntity{

    private Long classSectionIFk;
    private Long subjectIdFk;
    private Long tutorIdFk;
    private Long termIdFk;
    private Long academicYearIdFk;
    private DayOfWeek dayOfWeek;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String room;

}
