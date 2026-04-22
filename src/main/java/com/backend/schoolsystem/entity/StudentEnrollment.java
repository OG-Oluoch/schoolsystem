package com.backend.schoolsystem.entity;

import com.backend.schoolsystem.entity.enums.CurriculumType;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
public class StudentEnrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Student student_fk_id;
    private CurriculumType curriculumType;
    private String nemisNumber;
    private LocalDate enrollmentDate;
    private String grade_level_id;
    private String classes_section_id;
    private Long roll_number;
    private String status;

    private LocalDateTime created_at;
    private LocalDateTime updated_at;

    @PrePersist
    protected void onCreate() {
        created_at = LocalDateTime.now();
    }
}
