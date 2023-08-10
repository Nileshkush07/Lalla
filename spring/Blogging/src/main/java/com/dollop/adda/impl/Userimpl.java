package com.dollop.adda.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dollop.adda.Repo.UserRepo;
import com.dollop.adda.bean.User;
import com.dollop.service.Userservice;
@Service
public class Userimpl implements Userservice{

	@Autowired
	private UserRepo ur;
	
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return this.ur.save(user);
	}

	@Override
	public User getUser(Integer id) {
		// TODO Auto-generated method stub
		return this.ur.findById(id).get();
	}

	@Override
	public User getprofileByusername(User username) {
		// TODO Auto-generated method stub
	
		User us=new User();
		us.getUser_name();
		return this.ur.save(username);
	}

	

}
