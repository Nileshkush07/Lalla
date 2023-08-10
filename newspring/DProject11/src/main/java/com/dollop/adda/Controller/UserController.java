package com.dollop.adda.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dollop.adda.Entity.User;
import com.dollop.adda.Service.Userservice;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private Userservice us;
	
	@PostMapping("/save")
	public ResponseEntity<User> createUser(@RequestBody User user){
		ResponseEntity<User> response=new ResponseEntity<User>(this.us.saveUser(user),HttpStatus.OK);
		return response;
	}
	
	
	@GetMapping("/get/{id}")
	public ResponseEntity<User> getUser(@PathVariable Integer id){
		ResponseEntity<User> response=new ResponseEntity<User>(this.us.getUser(id),HttpStatus.OK);
		return response;
	}
	
	
	
	
	
	

}
