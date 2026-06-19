package com.backend.schoolsystem.service.impl;

import com.backend.schoolsystem.dto.TutorDto;
import com.backend.schoolsystem.entity.Tutor;
import com.backend.schoolsystem.entity.enums.TutorStatus;
import com.backend.schoolsystem.errorResponse.ErrorCode;
import com.backend.schoolsystem.exception.ResourceNotFoundException;
import com.backend.schoolsystem.mapper.TutorMapper;
import com.backend.schoolsystem.repository.TutorRepository;
import com.backend.schoolsystem.service.TutorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
                .orElseThrow(()-> new ResourceNotFoundException(ErrorCode.TEACHER_NOT_FOUND,"Tutor with the given id does not exist: "+id));
        return TutorMapper.mapToTutorDto(tutor);
    }

    @Override
    public TutorDto getTutorByEmail(String email) {

      Tutor tutor =  tutorRepository.findByEmail(email)
                .orElseThrow(()-> new ResourceNotFoundException(ErrorCode.TEACHER_NOT_FOUND,"Tutor with the given email does not exist: "+email));

      return TutorMapper.mapToTutorDto(tutor);
    }

    @Override
    public List<TutorDto> getAllTutors() {

        List<Tutor> tutorList = tutorRepository.findAll();


        return tutorList.stream().map((tutor)->TutorMapper.mapToTutorDto(tutor))
                .collect(Collectors.toList());
    }

    @Override
    public TutorDto updateTutor(Long id, TutorDto tutorDto) {

      Tutor tutor =  tutorRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Tutor with the given id does not exist: "+id));


      tutor.setSubjectSpecialization(tutorDto.getSubjectSpecialization());
      tutor.setGender(tutorDto.getGender());
      tutor.setStatus(TutorStatus.valueOf(tutorDto.getStatus()));

      Tutor updatedTutor = tutorRepository.save(tutor);

        return TutorMapper.mapToTutorDto(updatedTutor);
    }

    @Override
    public void deleteTutor(Long id) {

     Tutor tutor = tutorRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException(ErrorCode.TEACHER_NOT_FOUND,"Tutor with the given id does not exist: "+id));

     tutorRepository.delete(tutor);

    }


}
