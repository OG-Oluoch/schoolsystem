package com.backend.schoolsystem.controller;


import com.backend.schoolsystem.dto.TutorDto;

import com.backend.schoolsystem.entity.Tutor;
import com.backend.schoolsystem.service.TutorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    // get tutor by email
    @GetMapping("/email/{mail}")
    public ResponseEntity<TutorDto> getTutorByEmail(@PathVariable("mail") String email){

      TutorDto showTutor =  tutorService.getTutorByEmail(email);

      return ResponseEntity.ok(showTutor);

    }

    //get all tutors
    @GetMapping("/all")
    public ResponseEntity<List<TutorDto>> getAllTutors(){

        List<TutorDto> tutorDtoList = tutorService.getAllTutors();

        return ResponseEntity.ok(tutorDtoList);

    }

    //update tutor
    @PutMapping("{id}")
    public ResponseEntity<TutorDto> updateTutor(@PathVariable("id") Long id, @RequestBody TutorDto tutorDto){

     TutorDto tutorDto1 =  tutorService.updateTutor(id,tutorDto);

     return ResponseEntity.ok(tutorDto1);

    }

    //delete tutor
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteTutor(@PathVariable("id") Long id){

        tutorService.deleteTutor(id);

        return ResponseEntity.ok("Tutor deleted successfully");
    }
}
