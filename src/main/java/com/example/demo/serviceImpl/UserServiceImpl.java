package com.example.demo.serviceImpl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AuthRes;
import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.repo.UserRepo;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;

	@Override
	public AuthRes saveUser(UserDto dto) {

		AuthRes res = null;

		if (userRepo.findByUserName(dto.getUserName()).isPresent()) {
			res = new AuthRes("error", "Account Already Exist!");
		} else {
			User user = new User(dto.getId(), dto.getUserName(), dto.getPassword(), UUID.randomUUID().toString());
			User savedUser = userRepo.save(user);
			res = new AuthRes("ok", "Account Created");
		}
		return res;
	}

	@Override
	public AuthRes loginUser(UserDto dto) {

		AuthRes res = null;
		if (userRepo.findByUserName(dto.getUserName()).isPresent()) {
			if (userRepo.findByUserNameAndPasswordAndToken(dto.getUserName(), dto.getPassword(), dto.getToken())
					.isPresent()) {
				res = new AuthRes("ok", "sign in successful");
			} else {
				res = new AuthRes("error", "Username and Password mismatch");
			}
		} else {
			res = new AuthRes("error", "Account doesn't Exist");
		}
		return res;
	}

}
