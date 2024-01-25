package com.example.demo.service;

import com.example.demo.dto.AuthRes;
import com.example.demo.dto.UserDto;

public interface UserService {

	AuthRes saveUser(UserDto dto);

	AuthRes loginUser(UserDto dto);

}
