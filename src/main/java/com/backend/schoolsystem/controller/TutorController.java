package com.backend.schoolsystem.controller;


import com.backend.schoolsystem.dto.TutorDto;

import com.backend.schoolsystem.service.TutorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tutors")
@AllArgsConstructor
public class TutorController {

    private final TutorService tutorService;

    //add tutor rest api
    @PostMapping
    public ResponseEntity<TutorDto> createTutor(@RequestBody TutorDto tutorDto){

       TutorDto saveTutor = tutorService.createTutor(tutorDto);

       return new ResponseEntity<>(saveTutor, HttpStatus.CREATED);

    }

    // get tutor by id
    @GetMapping("{id}")
    public ResponseEntity<TutorDto> getTutorById(@PathVariable("id") Long id){

        TutorDto tutorDto = tutorService.getTutorById(id);

        return ResponseEntity.ok(tutorDto);

    }
}
