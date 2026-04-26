package com.backend.schoolsystem.service.impl;

import com.backend.schoolsystem.dto.TutorDto;
import com.backend.schoolsystem.entity.Tutor;
import com.backend.schoolsystem.mapper.TutorMapper;
import com.backend.schoolsystem.repository.TutorRepository;
import com.backend.schoolsystem.service.TutorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TutorServiceImp implements TutorService {

    private final TutorRepository tutorRepository;

    public TutorDto createTutor(TutorDto tutorDto){

        Tutor tutor = TutorMapper.mapToTutor(tutorDto);

      Tutor saveTutor = tutorRepository.save(tutor);

      return TutorMapper.mapToTutorDto(saveTutor);

    }
}
