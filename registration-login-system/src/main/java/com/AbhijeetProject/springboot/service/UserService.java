package com.AbhijeetProject.springboot.service;

import com.AbhijeetProject.springboot.dto.UserDto;
import com.AbhijeetProject.springboot.entity.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findUserByEmail(@NotEmpty(message = "Email should not be empty") @Email String email);

    List<UserDto> findAllUsers();
}
