package com.example.employeerecords.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeerecords.endities.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}