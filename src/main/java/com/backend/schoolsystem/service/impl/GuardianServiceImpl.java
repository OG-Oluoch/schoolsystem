package com.backend.schoolsystem.service.impl;

import com.backend.schoolsystem.dto.GuardianDto;
import com.backend.schoolsystem.entity.Guardian;
import com.backend.schoolsystem.errorResponse.ErrorCode;
import com.backend.schoolsystem.exception.ResourceNotFoundException;
import com.backend.schoolsystem.mapper.GuardianMapper;
import com.backend.schoolsystem.repository.GuardianRepository;
import com.backend.schoolsystem.service.GuardianService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GuardianServiceImpl implements GuardianService {

    private final GuardianRepository guardianRepository;
    @Override
    public GuardianDto createGuardian(GuardianDto updatedguardianDto) {

        Guardian guardian = GuardianMapper.mapToGuardian(updatedguardianDto);

        Guardian saveGuardian = guardianRepository.save(guardian);

        return GuardianMapper.mapToGuardianDto(saveGuardian);
    }

    @Override
    public GuardianDto getGuardianById(Long id) {

       Guardian guardian = guardianRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException(ErrorCode.PARENT_NOT_FOUND,"Guardian with the given id does not exist: "+id));
        return GuardianMapper.mapToGuardianDto(guardian);
    }

    @Override
    public GuardianDto getGuardianByEmail(String email) {

       Guardian guardian = guardianRepository.findByEmail(email)
                .orElseThrow(()-> new ResourceNotFoundException(ErrorCode.PARENT_NOT_FOUND,"Guardian with the given email does not exist: "+email));

       return GuardianMapper.mapToGuardianDto(guardian);
    }

    @Override
    public List<GuardianDto> getAllGuardians() {

        List<Guardian> guardianList = guardianRepository.findAll();

        return guardianList.stream()
                .map((GuardianMapper::mapToGuardianDto))
                .collect(java.util.stream.Collectors.toList());

    }

    @Override
    public GuardianDto updateGuardian(Long id, GuardianDto updatedGuardianDto) {

//        guardianRepository.findById(id)
//                .orElseThrow(()-> new ResourceNotFoundException("Guardian with the given id does not exist: "+id));
//
//         Guardian updatedGuardian = GuardianMapper.mapToGuardian(updatedGuardianDto);
//         updatedGuardian.setId(id);
//
//         Guardian saveUpdatedGuardian = guardianRepository.save(updatedGuardian);
//
//         return GuardianMapper.mapToGuardianDto(saveUpdatedGuardian);

        Guardian guardian =  guardianRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Tutor with the given id does not exist: "+id));


        guardian.setAddress(updatedGuardianDto.getAddress());

        Guardian updatedGuardian = guardianRepository.save(guardian);

        return GuardianMapper.mapToGuardianDto(updatedGuardian);

    }

    @Override
    public void deleteGuardian(Long id) {

        guardianRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException(ErrorCode.PARENT_NOT_FOUND,"Guardian with the given id does not exist: "+id));

        guardianRepository.deleteById(id);

    }
}
