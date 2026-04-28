package com.backend.schoolsystem.service.impl;

import com.backend.schoolsystem.dto.GuardianDto;
import com.backend.schoolsystem.entity.Guardian;
import com.backend.schoolsystem.mapper.GuardianMapper;
import com.backend.schoolsystem.repository.GuardianRepository;
import com.backend.schoolsystem.service.GuardianService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class GuardianServiceImpl implements GuardianService {

    private final GuardianRepository guardianRepository;
    @Override
    public GuardianDto createGuardian(GuardianDto guardianDto) {

        Guardian guardian = GuardianMapper.mapToGuardian(guardianDto);

        Guardian saveGuardian = guardianRepository.save(guardian);

        return GuardianMapper.mapToGuardianDto(saveGuardian);
    }
}
