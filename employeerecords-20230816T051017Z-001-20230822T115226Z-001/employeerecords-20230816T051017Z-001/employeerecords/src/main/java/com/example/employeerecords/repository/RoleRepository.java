package com.example.employeerecords.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employeerecords.endities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}