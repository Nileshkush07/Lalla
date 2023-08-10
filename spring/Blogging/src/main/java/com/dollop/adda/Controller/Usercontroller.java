package com.dollop.adda.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dollop.adda.bean.User;
import com.dollop.service.Userservice;



@RestController
@RequestMapping("/auth")
public class Usercontroller {
	
	@Autowired
	private Userservice us;
	
	@PostMapping("/adduser")
	public ResponseEntity<User> addUser(@RequestBody User user){
		ResponseEntity<User> response=new ResponseEntity<User>(this.us.addUser(user),HttpStatus.CREATED);
		return response;
	}

}
