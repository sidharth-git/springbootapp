package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AuthRes;
import com.example.demo.dto.UserDto;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/account")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping(value = "/sign-up")
	public ResponseEntity<AuthRes> saveUser(@RequestBody UserDto dto) throws Exception {

		try {
			AuthRes res = userService.saveUser(dto);
			return ResponseEntity.ok(res);
		} catch (Exception e) {
			throw new Exception(e);
		}
		

	}

	
	@PostMapping(value = "/sign-in")
	public ResponseEntity<AuthRes> loginUser(@RequestBody UserDto dto) throws Exception {

		try {
			AuthRes res = userService.loginUser(dto);
			return ResponseEntity.ok(res);
		} catch (Exception e) {
			throw new Exception(e);
		}
		

	}
}
