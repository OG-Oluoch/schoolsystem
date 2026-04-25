package com.backend.schoolsystem.service.impl;

import com.backend.schoolsystem.dto.StudentDto;
import com.backend.schoolsystem.entity.Student;
import com.backend.schoolsystem.exception.ResourceNotFoundException;
import com.backend.schoolsystem.mapper.StudentMapper;
import com.backend.schoolsystem.repository.StudentRepository;
import com.backend.schoolsystem.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;


    @Override
    public StudentDto createStudent(StudentDto studentDto) {

        Student student = StudentMapper.mapToStudent(studentDto);
       Student savedStudent = studentRepository.save(student);

        return StudentMapper.mapToStudentDto(savedStudent);
    }

    @Override
    public StudentDto getStudentById(Long id) {

      Student student =  studentRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Student does not exist with the given id: "+id));

      return StudentMapper.mapToStudentDto(student);
    }

    @Override
    public List<StudentDto> getAllStudents() {
        List<Student> studentList = studentRepository.findAll();
        return studentList.stream().map((student)->StudentMapper.mapToStudentDto(student))
                .collect(Collectors.toList());
    }
}
