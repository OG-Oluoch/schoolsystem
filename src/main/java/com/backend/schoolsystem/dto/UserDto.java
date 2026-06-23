package com.backend.schoolsystem.dto;

import java.time.LocalDateTime;

public record UserDto(
         String firstName,
         String lastName,
         String userName,
         String email,
         Integer phoneNumber,
         String password,


         LocalDateTime lastLogin,
         Boolean isActive
) {
}
