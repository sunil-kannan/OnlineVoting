package com.example.employeerecords.services;

import java.util.List;

import com.example.employeerecords.dto.UserDto;
import com.example.employeerecords.endities.User;

public interface UserService {
    void saveAdmin(UserDto userDto);

     // void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}