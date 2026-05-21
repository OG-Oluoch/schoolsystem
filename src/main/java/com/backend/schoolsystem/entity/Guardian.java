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

   @OneToOne(mappedBy = "guardian", fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private Long user_id;

    private String address;


}
