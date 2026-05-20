package com.backend.schoolsystem.entity;

import com.backend.schoolsystem.entity.enums.Gender;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;



@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Tutor extends BaseEntity{

    

    private String subjectSpecialization;
    private String department;
    private Gender gender;
    private LocalDate hireDate;
    private String status; // active, leave, transferred



}
