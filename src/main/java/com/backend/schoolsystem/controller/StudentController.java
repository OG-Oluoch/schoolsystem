package com.backend.schoolsystem.controller;

import com.backend.schoolsystem.dto.StudentDto;
import com.backend.schoolsystem.entity.Student;
import com.backend.schoolsystem.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    // get student by id rest api
    @GetMapping("{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable("id") Long studentId){

         StudentDto studentDto= studentService.getStudentById(studentId);

         return  ResponseEntity.ok(studentDto);

    }

    //get all students rest api
    @GetMapping("/all")
    public ResponseEntity<List<StudentDto>> getAllStudents(){

        List<StudentDto> studentList = studentService.getAllStudents();

        return ResponseEntity.ok(studentList);
    }

    //update student rest api
    @PutMapping("{id}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable("id") Long studentId,@RequestBody StudentDto updatedStudentDto){

       StudentDto studentDto = studentService.updateStudent(studentId,updatedStudentDto);

       return ResponseEntity.ok(studentDto);

    }

    //delete student rest api
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") Long studentId){

        studentService.deleteStudent(studentId);

        return ResponseEntity.ok("Student deleted successfully");

    }
}
