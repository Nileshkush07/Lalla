package com.dollop.app.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dollop.app.entity.User;
import com.dollop.app.entity.helper.UserData;
import com.dollop.app.exception.UserAlreadyExistException;
import com.dollop.app.exception.UserNotFoundException;
import com.dollop.app.payload.UserResponse;
import com.dollop.app.service.UserService;
import com.dollop.app.util.JWT_util;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	@Autowired
	private UserService us;
	@Autowired
	private AuthenticationManager authenticatManager;
	@Autowired
	private JWT_util jwt_util;
	@PostMapping("/login")
	private ResponseEntity<UserResponse> login(@RequestBody UserData ud)
	{
		ResponseEntity<UserResponse> response;
		try {
//			response = new ResponseEntity<User>(this.us.login(ud.userName, ud.password),HttpStatus.OK);
			Authentication authenticate = authenticatManager.authenticate(new UsernamePasswordAuthenticationToken(ud.getUserName(), ud.getPassword()));
			UserResponse userResponse = new UserResponse(jwt_util.genrateToken(ud.getUserName()),"PIYUSH");
			response = new ResponseEntity<UserResponse>(userResponse,HttpStatus.OK);
		} catch (UserNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		return response;
		
	}
	@PostMapping("/signup")
	private ResponseEntity<User> save(@RequestBody User user)
	{
		ResponseEntity<User> response ;
		try {
			response = new ResponseEntity<User>(this.us.signUp(user),HttpStatus.OK);
		} catch (UserAlreadyExistException e) {
			e.printStackTrace();
			throw e;
		}
		return response;
	}
	
}
