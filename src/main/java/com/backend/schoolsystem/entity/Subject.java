package com.backend.schoolsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Subject extends BaseEntity{


    private String subject_name;
    private String description;


    private String category; //academic based or interested based



}
