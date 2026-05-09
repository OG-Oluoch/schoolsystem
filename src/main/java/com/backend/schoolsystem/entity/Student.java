package com.backend.schoolsystem.entity;

import com.backend.schoolsystem.entity.enums.Gender;
import jakarta.persistence.*;


import lombok.*;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
public class Student extends BaseEntity{

  




    private Long user_id;

    @Column(unique = true, nullable = false)
    private String nemisNumber;



    @Enumerated(EnumType.STRING)
    private Gender gender;
    private LocalDate dateOfBirth;

    private LocalDate admissionDate;
    private boolean isActive;


    @Column(nullable = false, updatable = false)
    private LocalDateTime created_at;


    @Column(nullable = false)
    private LocalDateTime updated_at;


    public Student(Long id, String firstName, String middleName, String lastName, String nemisNumber, Long rollNumber, Gender gender, LocalDate localDate, String s, LocalDate localDate1, boolean active) {
        super();
    }
}
