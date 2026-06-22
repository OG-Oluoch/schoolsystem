package com.backend.schoolsystem.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@NoArgsConstructor
@Getter
@Setter


public class Guardian extends BaseEntity{

   @OneToOne(mappedBy = "guardian", fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user_id;

    private String address;

    public Guardian(User user_id, String address) {
        this.user_id = user_id;
        this.address = address;
    }
}
