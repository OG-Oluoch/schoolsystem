package com.backend.schoolsystem.mapper;

import com.backend.schoolsystem.dto.TutorDto;
import com.backend.schoolsystem.entity.Tutor;

public class TutorMapper {

    public static TutorDto mapToTutorDto(Tutor tutor){

        if(tutor==null){

            return null;
        }

        return new TutorDto(
                tutor.getId(),
                tutor.getFirstName(),
                tutor.getLastName(),
                tutor.getEmail(),
                tutor.getPhoneNumber(),
                tutor.getSubjectSpecialization(),
                tutor.getGender(),
                tutor.getStatus()
        );

    }

    public static Tutor mapToTutor(TutorDto tutorDto){

        if(tutorDto==null){

            return null;
        }

        return new Tutor(
                tutorDto.getId(),
                tutorDto.getFirstName(),
                tutorDto.getLastName(),
                tutorDto.getEmail(),
                tutorDto.getPhoneNumber(),
                tutorDto.getSubjectSpecialization(),
                tutorDto.getGender(),
                tutorDto.getStatus()
        );

    }
}
