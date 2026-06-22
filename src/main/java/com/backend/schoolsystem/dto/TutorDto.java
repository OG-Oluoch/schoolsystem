package com.backend.schoolsystem.dto;

import com.backend.schoolsystem.entity.enums.Gender;
import com.backend.schoolsystem.entity.enums.TutorStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public record TutorDto( Long id,
        String firstName,
        String lastName,
        String email,
        Integer phoneNumber,
        String subjectSpecialization,
        Gender gender,
        String status) {

}
