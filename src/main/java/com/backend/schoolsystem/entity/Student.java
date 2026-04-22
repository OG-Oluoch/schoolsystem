package com.backend.schoolsystem.entity;

import com.backend.schoolsystem.entity.enums.Gender;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@Entity
@Table(name = "students")
public class Student {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   @Column(unique = true, nullable = false)
    private String nemisNumber;

    private String firstName;
    private String middleName;
    private String lastName;

    private Long rollNumber;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private Date dateOfBirth;
    private String currentClassSection;
    private Date admissionDate;
    private boolean isActive;


    @Column(nullable = false, updatable = false)
    private LocalDateTime created_at;


    @Column(nullable = false)
    private LocalDateTime updated_at;

    public Student(Long id, String firstName, String middleName, String lastName, String nemisNumber, Long rollNumber, Gender gender, Date date, String s, Date date1, boolean active) {
    }

    // Automatically set the created_at field when the entity is persisted
  @PrePersist
  protected void onCreate() {
  created_at = LocalDateTime.now();
  }


}
