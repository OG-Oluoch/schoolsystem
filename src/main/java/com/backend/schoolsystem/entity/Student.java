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
@Data
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Column(unique = true, nullable = false)
    private String nemisNumber;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    @JoinColumn(name = "admission_number", referencedColumnName = "admissionNumber")
    private StudentEnrollment admissionNumber;


    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    @JoinColumn(name = "gradeLevel_id")
    private GradeLevel gradeLevel;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private LocalDate dateOfBirth;

    @Enumerated(EnumType.STRING)
    private StudentStatus status;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @PrePersist
    public void onCreate(){
        createdAt = LocalDateTime.now();

    }

    @PreUpdate
    public void onUpdate(){

        updatedAt = LocalDateTime.now();
    }



}
