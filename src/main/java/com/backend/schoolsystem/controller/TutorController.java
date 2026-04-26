package com.backend.schoolsystem.controller;

import com.backend.schoolsystem.dto.TutorDto;
import com.backend.schoolsystem.service.TutorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tutors")
@AllArgsConstructor
public class TutorController {

    private final TutorService tutorService;

    @PostMapping
    public ResponseEntity<TutorDto> createTutor(@RequestBody TutorDto tutorDto){

       TutorDto saveTutor = tutorService.createTutor(tutorDto);

       return new ResponseEntity<>(saveTutor, HttpStatus.CREATED);

    }
}
