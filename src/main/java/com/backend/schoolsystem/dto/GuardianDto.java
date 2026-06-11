package com.backend.schoolsystem.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class GuardianDto {

    private Long user_id;

    private String address;

    public GuardianDto(Long user_id, String address) {
        this.user_id = user_id;
        this.address = address;
    }
}
