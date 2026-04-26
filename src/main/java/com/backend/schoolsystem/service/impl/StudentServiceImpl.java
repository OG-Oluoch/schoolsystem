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

    private final StudentRepository studentRepository;


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
        return studentList.stream().map(StudentMapper::mapToStudentDto)
                .collect(Collectors.toList());
    }

    @Override
    public StudentDto updateStudent(Long studentId, StudentDto studentDto) {

       Student student = studentRepository.findById(studentId)
                .orElseThrow(()-> new ResourceNotFoundException("Student does not exist with the given id: "+studentId));

       student.setFirstName(studentDto.getFirstName());
       student.setMiddleName(studentDto.getMiddleName());
       student.setLastName(studentDto.getLastName());
       student.setNemisNumber(studentDto.getNemisNumber());
       student.setRollNumber(studentDto.getRollNumber());
       student.setGender(studentDto.getGender());
       student.setDateOfBirth(studentDto.getDateOfBirth());
       student.setCurrentClassSection(studentDto.getCurrentClassSection());
       student.setAdmissionDate(studentDto.getAdmissionDate());
       student.setActive(studentDto.isActive());

       Student updatedStudent = studentRepository.save(student);

        return StudentMapper.mapToStudentDto(updatedStudent);
    }

    @Override
    public void deleteStudent(Long studentId) {

        Student student =  studentRepository.findById(studentId)
                .orElseThrow(()-> new ResourceNotFoundException("Student does not exist with the given id: "+studentId));

        studentRepository.delete(student);

    }
}
