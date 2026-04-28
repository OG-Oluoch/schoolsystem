package com.backend.schoolsystem.service;

import com.backend.schoolsystem.dto.GuardianDto;

import java.util.List;

public interface GuardianService {

    GuardianDto createGuardian(GuardianDto guardianDto);

    GuardianDto getGuardianById(Long id);

    GuardianDto getGuardianByEmail(String email);

    List<GuardianDto> getAllGuardians();

    GuardianDto updateGuardian(Long id, GuardianDto updatedGuardianDto);

    void deleteGuardian(Long id);
}
