package com.backend.schoolsystem.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter


public class Guardian extends BaseEntity{


    private Long user_id;

    private String address;






}
