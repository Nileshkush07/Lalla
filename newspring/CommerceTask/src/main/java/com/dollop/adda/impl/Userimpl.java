package com.dollop.adda.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dollop.adda.Repo.UserRepo;
import com.dollop.adda.bean.User;
import com.dollop.adda.exception.UserNotFoundException;
import com.dollop.adda.service.Userservice;
@Service
public class Userimpl implements Userservice{

	@Autowired
	private UserRepo ur;
	@Override
	public User registerUser(User user) {
		// TODO Auto-generated method stub
		return this.ur.save(user);
	}

	@Override
	public User loginuser(Integer id) {
		// TODO Auto-generated method stub
		if(id==1)
			return new User();
		else
			throw new UserNotFoundException("invalid user");
	}

	@Override
	public List<User> getUser() {
		// TODO Auto-generated method stub
		return this.ur.findAll();
	}

	@Override
	public User getUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
