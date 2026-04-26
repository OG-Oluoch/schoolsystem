package com.backend.schoolsystem.service.impl;

import com.backend.schoolsystem.dto.TutorDto;
import com.backend.schoolsystem.entity.Tutor;
import com.backend.schoolsystem.exception.ResourceNotFoundException;
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

    @Override
    public TutorDto getTutorById(Long id) {

        Tutor tutor = tutorRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("Tutor with the given id does not exist: "+id));
        return TutorMapper.mapToTutorDto(tutor);
    }
}
