package com.backend.schoolsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Entity
@NoArgsConstructor
@AllArgsConstructor
public class StudentEnrollment extends BaseEntity{



    private Long student_fk_id;
    private Long academic_year_id;
    private String nemisNumber;
    private LocalDate enrollmentDate;
    private String grade_level_id;
    private String classes_section_id;
    private Long roll_number;
    private String status; // active, transferred, completed


}
