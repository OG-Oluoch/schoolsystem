package com.backend.schoolsystem.entity;

import com.backend.schoolsystem.entity.enums.Gender;
import com.backend.schoolsystem.entity.enums.TutorStatus;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;



@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Tutor extends BaseEntity{

    @OneToOne(mappedBy = "tutor", fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
    private String subjectSpecialization;
    private String department;
    private Gender gender;
    private LocalDate hireDate;
    private TutorStatus status; // active, leave, transferred



}
