package com.backend.schoolsystem.entity;

import com.backend.schoolsystem.entity.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tutor extends BaseEntity{

    
    private String firstName;
    private String lastName;
    private String email;
    private Integer phoneNumber;
    private String subjectSpecialization;
    private Gender gender;
    private String status;


    public Tutor(Long id, String firstName, String lastName, String email, Integer phoneNumber, String subjectSpecialization, Gender gender, String status) {
        super();
    }
}
