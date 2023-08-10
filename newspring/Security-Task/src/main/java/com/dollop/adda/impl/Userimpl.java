package com.dollop.adda.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.dollop.adda.Repo.UserRepo;
import com.dollop.adda.bean.User;
import com.dollop.adda.srvice.Userservice;


@Service
public class Userimpl implements Userservice{
	
	@Autowired
	private UserRepo ur;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	public Integer saveUser(User user) {
		// TODO Auto-generated method stub
		String encPwd=passwordEncoder.encode(user.getUpswd());
		user.setUpswd(encPwd);
		return ur.save(user).getUid();
	}

	@Override
	public Optional<User> getOneUser(Integer id) {
		// TODO Auto-generated method stub
		return ur.findById(id);
	}

}
