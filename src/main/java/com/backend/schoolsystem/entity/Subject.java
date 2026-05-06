package com.backend.schoolsystem.entity;

import com.backend.schoolsystem.entity.enums.CurriculumType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Subject extends BaseEntity{


    private String subject_name;
    private String description;

    @Enumerated(EnumType.STRING)
    private CurriculumType curriculumType; //CBC or 8-4-4
    private String category; //academic based or interested based



}
