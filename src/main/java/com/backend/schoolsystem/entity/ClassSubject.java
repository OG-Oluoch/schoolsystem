package com.backend.schoolsystem.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor

public class ClassSubject extends BaseEntity{

    private Long class_section_id;
    private Long subject_id;
    private Long teacher_id;

}
