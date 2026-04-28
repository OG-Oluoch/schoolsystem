package com.backend.schoolsystem.repository;

import com.backend.schoolsystem.entity.Guardian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GuardianRepository extends JpaRepository<Guardian,Long> {

    Optional<Guardian> findByEmail(String email);
}
