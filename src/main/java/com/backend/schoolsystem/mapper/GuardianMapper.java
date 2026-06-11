package com.backend.schoolsystem.mapper;

import com.backend.schoolsystem.dto.GuardianDto;
import com.backend.schoolsystem.entity.Guardian;

public class GuardianMapper {

    public static GuardianDto mapToGuardianDto(Guardian guardian){

        if(guardian==null){

            return null;
        }

        return new GuardianDto(
                guardian.getUser_id(),
                guardian.getAddress()
        ) ;


    }

    public static Guardian mapToGuardian(GuardianDto guardianDto){

        if(guardianDto==null){

            return null;
        }

        return new Guardian(

                guardianDto.getId(),
                guardianDto.getFirstName(),
                guardianDto.getMiddleName(),
                guardianDto.getLastName(),
                guardianDto.getEmail(),
                guardianDto.getPhoneNumber(),
                guardianDto.getAddress()

        );

    }
}
