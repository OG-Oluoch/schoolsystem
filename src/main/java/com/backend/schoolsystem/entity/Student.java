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
public class Student {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    private String firstName;
    private String middleName;
    private String lastName;

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




    public Student(Long id, String firstName, String middleName, String lastName, String nemisNumber, Long rollNumber, Gender gender, LocalDate date, String currentClassSection, LocalDate admissionDate, boolean active) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.nemisNumber = nemisNumber;
        this.rollNumber = rollNumber;
        this.gender = gender;
        this.dateOfBirth = date;
        this.currentClassSection = currentClassSection;
        this.admissionDate = admissionDate;
        this.isActive = active;
    }




    // Automatically set the created_at field when the entity is persisted
  @PrePersist
  protected void onCreate() {

        this.created_at = LocalDateTime.now();
        this.updated_at = LocalDateTime.now();
  }

    // Automatically update the updated_at field when the entity is updated
    @PreUpdate
    protected void onUpdate() {
        this.updated_at = LocalDateTime.now();
    }


}
