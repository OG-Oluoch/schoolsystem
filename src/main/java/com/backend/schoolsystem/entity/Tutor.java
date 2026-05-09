package com.backend.schoolsystem.entity;

import com.backend.schoolsystem.entity.enums.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Tutor extends BaseEntity{

    
    private Long user_id;
    private String subjectSpecialization;
    private String department;
    private Gender gender;
    private LocalDate hireDate;
    private String status; // active, leave, transferred



}
