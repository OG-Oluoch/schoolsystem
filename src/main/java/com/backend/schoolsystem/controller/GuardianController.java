package com.backend.schoolsystem.controller;

import com.backend.schoolsystem.dto.GuardianDto;
import com.backend.schoolsystem.service.GuardianService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/guardians")
@AllArgsConstructor
public class GuardianController {

    private final GuardianService guardianService;

    // add guardian
    @PostMapping
    public ResponseEntity<GuardianDto> createGuardian(@RequestBody GuardianDto guardianDto) {
        GuardianDto saveGuardian = guardianService.createGuardian(guardianDto);


        return new ResponseEntity<>(saveGuardian, HttpStatus.CREATED);
    }

    // get guardian by id
    @GetMapping("{id}")
    public ResponseEntity<GuardianDto> getGuardianById(@PathVariable("id") Long id) {
        GuardianDto guardianDto = guardianService.getGuardianById(id);
        return ResponseEntity.ok(guardianDto);
    }

    // get guardian by email
    @GetMapping("/email/{mail}")
    public ResponseEntity<GuardianDto> getGuardianByEmail(@PathVariable("mail") String email) {
        GuardianDto guardianDto = guardianService.getGuardianByEmail(email);
        return ResponseEntity.ok(guardianDto);
    }

    //get all guardians
    @GetMapping("/all")
    public ResponseEntity<List<GuardianDto>> getAllGuardians() {

        List<GuardianDto> guardianDtoList= guardianService.getAllGuardians();

        return ResponseEntity.ok(guardianDtoList);
    }

    //update guardian
    @PutMapping("{id}")
    public ResponseEntity<GuardianDto> updateGuardian(@PathVariable Long id,@RequestBody GuardianDto guardianDto){

            GuardianDto updateGuardian = guardianService.updateGuardian(id, guardianDto);

            return ResponseEntity.ok(updateGuardian);
    }

    //delete guardian
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteGuardian(@PathVariable("id") Long id){

        guardianService.deleteGuardian(id);

        return ResponseEntity.ok("Guardian with the given id has been deleted successfully: "+id);
    }
}
