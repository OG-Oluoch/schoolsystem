package com.backend.schoolsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class StudentParent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Student student;
    @ManyToOne
    private Guardian guardian;
    private String relationship;
}
