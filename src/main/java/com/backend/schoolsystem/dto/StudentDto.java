package com.backend.schoolsystem.dto;

import com.backend.schoolsystem.entity.GradeLevel;
import com.backend.schoolsystem.entity.StudentEnrollment;
import com.backend.schoolsystem.entity.User;
import com.backend.schoolsystem.entity.enums.Gender;
import com.backend.schoolsystem.entity.enums.StudentStatus;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentDto {

    private User user_id;

    private String nemisNumber;

    private StudentEnrollment admissionNumber;

    private GradeLevel gradeLevel;
    private Gender gender;
    private LocalDate dateOfBirth;
    private LocalDate admissionDate;
    private StudentStatus isActive;


    public StudentDto(Long user_id, String nemisNumber, StudentEnrollment admissionNumber, GradeLevel gradeLevel, Gender gender, LocalDate localDate, StudentStatus status) {
    }
}
