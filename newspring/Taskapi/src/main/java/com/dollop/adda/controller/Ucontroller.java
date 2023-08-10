package com.dollop.adda.controller;


import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dollop.adda.bean.User;
import com.dollop.adda.service.Rservice;
import com.dollop.adda.service.Uservice;



@RestController
@RequestMapping("/my")
public class Ucontroller {
@Autowired
	private Uservice ser;

@Autowired
private Rservice rser;

	@PostMapping("/save")
public ResponseEntity<User> saveUser(@RequestBody User user){
    ResponseEntity<User> response=new ResponseEntity<User>(this.ser.save(user),HttpStatus.OK);
	return response;
}

	@DeleteMapping("{id}")
	public ResponseEntity<User> deleteUser(@PathVariable("id") Integer id){
		this.ser.deleteUser(id);
		return new ResponseEntity<User>(HttpStatus.OK);
	}
	
	@PutMapping("/update")
	public ResponseEntity<User> updateUser(@RequestBody User user)
	{
		ResponseEntity<User>response = new ResponseEntity<User>(this.ser.updateUser(user),HttpStatus.OK);
		return response;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<User>> getAllUser(){	
		List<User> users =ser.findAllUser();
		return new ResponseEntity<>(users,HttpStatus.OK);
	}
	
	@GetMapping("/find/{id}")
	public ResponseEntity<User> getUser(@PathVariable("id") Integer id){
		ResponseEntity<User> response=new ResponseEntity<User>(this.ser.getUser(id),HttpStatus.OK);
		return response;
		
	}
	
	@GetMapping("/role/{id}")
	public ResponseEntity<String> getRoleByUser(@PathVariable("id") Integer id){
		ResponseEntity<String> response = new ResponseEntity<String>(this.rser.getRoleByUserId(id),HttpStatus.OK);
		return response;
	}
	
	@GetMapping("/roles")
	private ResponseEntity<Map<Integer, String>> getMappedRoles()
	{ 
		ResponseEntity<Map<Integer, String>> response = new ResponseEntity<Map<Integer,String>>(this.rser.getMappedRoles(),HttpStatus.OK);
		return response;
	}
}
