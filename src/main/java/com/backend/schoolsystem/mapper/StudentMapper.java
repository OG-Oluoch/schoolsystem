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
            student.getUser() != null ? student.getUser().getId() : null,
                student.getNemisNumber(),
                student.getAdmissionNumber(),
                student.getGradeLevel(),
                student.getGender(),
                student.getDateOfBirth() != null ? student.getDateOfBirth() : null,
                student.getStatus());


    }

    public static Student mapToStudent(StudentDto studentDto){

        if(studentDto==null){
            return null;
        }

       return new Student(
                studentDto.getId(),
                studentDto.getFirstName(),
                studentDto.getMiddleName(),
                studentDto.getLastName(),
                studentDto.getNemisNumber(),
                studentDto.getRollNumber(),
                studentDto.getGender(),
                studentDto.getDateOfBirth() != null ? studentDto.getDateOfBirth() : null,
                studentDto.getCurrentClassSection() != null ? studentDto.getCurrentClassSection() : null,
                studentDto.isActive()
       );


    }
}
