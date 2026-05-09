package com.backend.schoolsystem.entity;

import com.backend.schoolsystem.entity.enums.CurriculumType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class StudentEnrollment extends BaseEntity{



    private Long student_fk_id;
    private CurriculumType curriculumType;
    private Long academic_year_id;
    private String nemisNumber;
    private LocalDate enrollmentDate;
    private String grade_level_id;
    private String classes_section_id;
    private Long roll_number;
    private String status; // active, transferred, completed


}
