package com.example.AcademicProjectManagementSystemApp.Repository;

import com.example.AcademicProjectManagementSystemApp.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String emailId);
}
