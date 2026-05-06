package com.backend.schoolsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class StudentParent extends BaseEntity{


    @ManyToOne
    private Student student;
    @ManyToOne
    private Guardian guardian;
    private String relationship;
}
