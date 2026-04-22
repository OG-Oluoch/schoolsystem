package com.backend.schoolsystem.dto;

import com.backend.schoolsystem.entity.enums.Gender;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class StudentDto {

    private Long id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String nemisNumber;
    private Long rollNumber;
    private Gender gender;
    private Date dateOfBirth;
    private String currentClassSection;
    private Date admissionDate;
    private boolean isActive;

}
