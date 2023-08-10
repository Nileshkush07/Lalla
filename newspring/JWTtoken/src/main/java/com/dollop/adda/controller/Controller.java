package com.dollop.adda.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dollop.adda.bean.User;
import com.dollop.adda.bean.UserRequest;
import com.dollop.adda.bean.UserResponse;
import com.dollop.adda.service.Userservice;
import com.dollop.adda.util.JWTUtils;

@RestController
@RequestMapping("/user")
public class Controller {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private Userservice service;
	
	@Autowired
	private JWTUtils util;
	
	@PostMapping("/save")
	public ResponseEntity<String> saveUser(@RequestBody User user){
		service.saveUser(user);
		return ResponseEntity.ok("user created");
	}

	@PostMapping("/login")
	public ResponseEntity<UserResponse> loginUser(@RequestBody UserRequest userRequest){
		authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(userRequest.getUname(), userRequest.getUpassword()));
		String token=util.GenerateToken(userRequest.getUname());
		return ResponseEntity.ok(new UserResponse(token,"generated"));
	}
	
	
	@PostMapping("/welcome")
	public ResponseEntity<String> showUserData(Principal principal){
		System.out.println(principal.getClass().getName());
		return ResponseEntity.ok("hello" +principal.getName());
	}
	
}
