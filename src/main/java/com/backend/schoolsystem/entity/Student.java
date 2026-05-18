package com.backend.schoolsystem.entity;

import com.backend.schoolsystem.entity.enums.Gender;
import com.backend.schoolsystem.entity.enums.StudentStatus;
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

  






    @Column(unique = true, nullable = false)
    private String nemisNumber;



    @Enumerated(EnumType.STRING)
    private Gender gender;
    private LocalDate dateOfBirth;

    private LocalDate admissionDate;

    @Enumerated(EnumType.STRING)
    private StudentStatus status = StudentStatus.ACTIVE;





    public Student(Long id, String firstName, String middleName, String lastName, String nemisNumber, Long rollNumber, Gender gender, LocalDate localDate, String s, LocalDate localDate1, boolean active) {
        super();
    }
}
