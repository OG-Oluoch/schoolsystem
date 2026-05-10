package com.backend.schoolsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
public class StudentGuardian extends BaseEntity{


    @ManyToOne
    private Student student;
    @ManyToOne
    private Guardian guardian;
    private String relationship;
}
