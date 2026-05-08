package com.backend.schoolsystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TutorSubject extends BaseEntity{

    private Long teacherId;
    private Long subjectId;
    private Long gradeLevelId;
    private Long academicYearId;
    private Boolean isPrimary;
}
