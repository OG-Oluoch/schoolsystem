package com.backend.schoolsystem.mapper;

import com.backend.schoolsystem.dto.StudentDto;
import com.backend.schoolsystem.entity.Student;

import java.time.LocalDate;

public class StudentMapper {

    public static StudentDto mapToStudentDto(Student student){

        if(student == null){
            return null;
        }

        return new StudentDto(
            student.getId(),
            student.getFirstName(),
            student.getMiddleName(),
            student.getLastName(),
            student.getNemisNumber(),
            student.getRollNumber(),
            student.getGender(),
            student.getDateOfBirth() != null ? student.getDateOfBirth().toString() : null,
            student.getCurrentClassSection() != null ? student.getCurrentClassSection() : null,
            student.getAdmissionDate() != null ? student.getAdmissionDate().toString() : null,
            student.isActive()
        );

    }

    public static Student mapToStudent(StudentDto studentDto){

        if(studentDto==null){
            return null;
        }

       return new StudentDto(
                studentDto.getId(),
                studentDto.getFirstName(),
                studentDto.getMiddleName(),
                studentDto.getLastName(),
                studentDto.getNemisNumber(),
                studentDto.getRollNumber(),
                studentDto.getGender(),
                studentDto.getDateOfBirth() != null ? LocalDate.parse(studentDto.getDateOfBirth()) : null,
                studentDto.getCurrentClassSection() != null ? studentDto.getCurrentClassSection() : null,
                studentDto.getAdmissionDate() != null ? LocalDate.parse(studentDto.getAdmissionDate()) : null,
                studentDto.isActive()
       );


    }
}
