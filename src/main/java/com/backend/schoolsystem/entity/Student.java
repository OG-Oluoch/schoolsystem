package com.backend.schoolsystem.entity;

import com.backend.schoolsystem.entity.enums.Gender;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;

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

   @Column(unique = true, nullable = false)
    private String nemis_number;

    private String first_name;
    private String middle_name;
    private String last_name;

    private Long roll_number;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String date_of_birth;
    private String current_class_section;
    private Date admission_date;
    private boolean is_active;


    @Column(nullable = false, updatable = false)
    private LocalDateTime created_at;


    @Column(nullable = false)
    private LocalDateTime updated_at;

  // Automatically set the created_at field when the entity is persisted
  @PrePersist
  protected void onCreate() {
  created_at = LocalDateTime.now();
  }


}
