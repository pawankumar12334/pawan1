package com.example.login.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.login.entity.Login;

public interface LoginRepo extends JpaRepository<Login, Long> {

}
