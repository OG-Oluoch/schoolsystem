package com.backend.schoolsystem.service;

import com.backend.schoolsystem.dto.TutorDto;

import java.util.List;

public interface TutorService {

    TutorDto createTutor(TutorDto tutorDto);

    TutorDto getTutorById(Long id);

    TutorDto getTutorByEmail(String email);

    List<TutorDto> getAllTutors();
}
