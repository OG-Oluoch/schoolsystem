package com.backend.schoolsystem.dto;

import com.backend.schoolsystem.entity.GradeLevel;
import com.backend.schoolsystem.entity.StudentEnrollment;
import com.backend.schoolsystem.entity.User;
import com.backend.schoolsystem.entity.enums.Gender;
import com.backend.schoolsystem.entity.enums.StudentStatus;
import lombok.*;

import java.time.LocalDate;
import java.util.Date;


public record StudentDto(Long user_id,

        String nemisNumber,

        Long admissionNumber,

        Integer gradeLevel,
        Gender gender,
        LocalDate dateOfBirth,
        LocalDate admissionDate,
        StudentStatus isActive) {



}
