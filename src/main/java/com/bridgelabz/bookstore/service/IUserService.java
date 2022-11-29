package com.bridgelabz.bookstore.service;

import java.util.List;

import com.bridgelabz.bookstore.ResponseEntity;
import com.bridgelabz.bookstore.dto.LoginDto;
import com.bridgelabz.bookstore.dto.UserDto;

public interface IUserService {

	ResponseEntity add(UserDto userDto);

	List<UserDto> findAll();

	UserDto findById(Long Id);

	UserDto getUserByEmail(String email);

	UserDto editUserByEmail(String email_address, UserDto userDto);

	String loginUser(LoginDto loginDto);

	UserDto logout(String token);

//	String forgotPassword(UserDto userDto);

	String resetPassword(UserDto userDto);

}

