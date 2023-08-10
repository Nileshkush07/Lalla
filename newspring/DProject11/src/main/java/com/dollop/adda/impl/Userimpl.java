package com.dollop.adda.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dollop.adda.Entity.User;
import com.dollop.adda.Exception.ResourceNotFoundException;
import com.dollop.adda.Repo.UserRepo;
import com.dollop.adda.Service.Userservice;

@Service
public class Userimpl implements Userservice {
	@Autowired
	private UserRepo ur;
	
	@Autowired
	private RestTemplate restTemplate ;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		String randomUserId= UUID.randomUUID().toString();
		user.setUid(randomUserId);
		return this.ur.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return this.ur.findAll();
	}

	@Override
	public User getUser(Integer id) {
		// TODO Auto-generated method stub
		User user= this.ur.findById(id).orElseThrow(() -> new ResourceNotFoundException("user id not found"));
		restTemplate.getForObject(url:"", null)
		return user;
	}

}
