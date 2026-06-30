package com.backend.schoolsystem.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Guardian {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

   @OneToOne(mappedBy = "guardian", fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user_id;

    private String address;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @PrePersist
    public void onCreate(){
        createdAt = LocalDateTime.now();

    }

    @PreUpdate
    public void onUpdate(){

        updatedAt = LocalDateTime.now();
    }


}
