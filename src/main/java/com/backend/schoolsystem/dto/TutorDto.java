package com.backend.schoolsystem.dto;

import com.backend.schoolsystem.entity.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TutorDto {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer phoneNumber;
    private String subjectSpecialization;
    private Gender gender;
    private String status;

}
