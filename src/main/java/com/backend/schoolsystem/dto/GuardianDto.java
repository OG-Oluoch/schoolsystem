package com.backend.schoolsystem.dto;


import com.backend.schoolsystem.entity.User;

public record GuardianDto(User userDto, String address) {

}
