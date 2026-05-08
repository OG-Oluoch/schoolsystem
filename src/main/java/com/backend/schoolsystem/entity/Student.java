package com.backend.schoolsystem.entity;

import com.backend.schoolsystem.entity.enums.Gender;
import jakarta.persistence.*;


import lombok.*;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
public class Student extends BaseEntity{

  



    private String firstName;
    private String middleName;
    private String lastName;
    private Long user_id;

    @Column(unique = true, nullable = false)
    private String nemisNumber;

    @Column(unique = true, nullable = false)
    private Long rollNumber;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private LocalDate dateOfBirth;
    private String currentClassSection;
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
