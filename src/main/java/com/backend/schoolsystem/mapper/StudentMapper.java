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

                student.getUser(),
                student.getNemisNumber(),
                student.getAdmissionNumber(),
                student.getGradeLevel(),
                student.getGender(),
                student.getDateOfBirth(),
                student.getStatus());

    }

    public static Student mapToStudent(StudentDto studentDto){

        if(studentDto==null){
            return null;
        }

       return new Student(
               studentDto.user_id(),
               studentDto.admissionNumber(),
               studentDto.gradeLevel(),
               studentDto.gender(),
               studentDto.dateOfBirth(),
               studentDto.admissionDate(),
               studentDto.isActive()

       );


    }
}
