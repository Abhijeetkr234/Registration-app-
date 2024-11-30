package com.AbhijeetProject.springboot.repository;

import com.AbhijeetProject.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User findByEmail(String email);
}
