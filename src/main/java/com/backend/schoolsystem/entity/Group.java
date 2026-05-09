package com.backend.schoolsystem.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Group extends BaseEntity{

    private Long patronIdFk; // tutor
    private String groupName;
    private String groupCategory;
    private String description;
    private Long academicYearIdFk;

}
