package com.example.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.login.entity.Login;
import com.example.login.repo.LoginRepo;

@RestController
public class LoginController {
	@Autowired
	LoginRepo loginRepo;

	@GetMapping("/api/hello")
	public String hello(){
		return "hello san";
	}
	@GetMapping("/api/login")
	public ResponseEntity<Login> saveLogin(@RequestBody Login login) {
		return new ResponseEntity<> (loginRepo.save(login),HttpStatus.CREATED);
	}
	

		
	}
