package com.backend.schoolsystem.controller;

import com.backend.schoolsystem.dto.GuardianDto;
import com.backend.schoolsystem.service.GuardianService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
