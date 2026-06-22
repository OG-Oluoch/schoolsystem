package com.backend.schoolsystem.entity;

import com.backend.schoolsystem.entity.enums.Gender;
import com.backend.schoolsystem.entity.enums.StudentStatus;
import jakarta.persistence.*;


import lombok.*;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "students")
@Getter
@Setter
public class Student extends BaseEntity{

  



    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @Column(unique = true, nullable = false)
    private String nemisNumber;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    @JoinColumn(name = "admission_number", referencedColumnName = "admissionNumber")
    private StudentEnrollment admissionNumber;


    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    private GradeLevel gradeLevel;

    @Enumerated(EnumType.STRING)
    private Gender gender;
    private LocalDate dateOfBirth;

    @OneToOne(mappedBy = "student", cascade = CascadeType.ALL)
    @JoinColumn(name = "enrollmentDate", referencedColumnName = "enrollmentDate")
    private StudentEnrollment admissionDate;

    @Enumerated(EnumType.STRING)
    private StudentStatus status;





    public Student( String firstName, String middleName, String lastName, String nemisNumber, Long rollNumber, Gender gender, LocalDate localDate, String s, LocalDate localDate1, boolean active) {

    }

}
