package com.backend.schoolsystem.controller;

import com.backend.schoolsystem.dto.StudentDto;
import com.backend.schoolsystem.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
@AllArgsConstructor
public class StudentController {

    private StudentService studentService;

    //add student rest api
    @PostMapping
    public ResponseEntity<StudentDto> createStudent(@RequestBody StudentDto studentDto){

       StudentDto savedStudent = studentService.createStudent(studentDto);

       return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);

    }
}
