package com.backend.schoolsystem.dto;

import com.backend.schoolsystem.entity.GradeLevel;
import com.backend.schoolsystem.entity.enums.Gender;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentDto {

    private Long user_id;

    private String nemisNumber;

    private String gradeLevel;

    private Long admissionNumber;
    private Gender gender;
    private LocalDate dateOfBirth;
    private LocalDate admissionDate;
    private boolean isActive;

}
