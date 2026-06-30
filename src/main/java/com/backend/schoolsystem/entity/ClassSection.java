package com.backend.schoolsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.Year;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClassSection  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String sectionName;

    @ManyToOne
    private GradeLevel gradeLevel;

    @ManyToOne
    private Tutor tutor;
    private Year academicYear;

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
