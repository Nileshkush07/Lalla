package com.dollop.adda.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dollop.adda.bean.User;
import com.dollop.adda.exception.UserNotFoundException;
import com.dollop.adda.service.Userservice;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private Userservice us;
	
	@PostMapping("/useradd")
	public ResponseEntity<User> registerUser(@RequestBody User user)
	{
		User usr = this.us.registerUser(user);
		  
		
		return new ResponseEntity<User>(usr, HttpStatus.OK);
	}
	

	 @GetMapping("/get{id}")
	 public ResponseEntity<User> loginuser(@PathVariable("id") Integer id){
	 
ResponseEntity<User> response=null;
try {
	 User ur=us.loginuser(id);
	 response =new ResponseEntity<User>(ur,HttpStatus.OK);
	 }
catch(UserNotFoundException unfe) {
	unfe.printStackTrace();
	throw unfe;
}
return response;
}
	 @GetMapping("/list")
		private ResponseEntity<List<User>> getAllUser()
		{
			ResponseEntity<List<User>> response = null;
			try {
				
				
				response = new ResponseEntity<List<User>>(this.us.getUser(),HttpStatus.OK);
			}
			catch (UserNotFoundException e) {
				e.printStackTrace();
				throw e;
			}
			return response;
}
}
