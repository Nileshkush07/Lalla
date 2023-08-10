package com.dollop.adda.service;



import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;

import com.dollop.adda.bean.User;

public interface Userservice {
	
	public Integer saveUser(User user);
	
	//Optional<User> getOneUser(Integer id);
	
	public User findbyuname(String uname);

	Optional<User> getUserById(Integer Id);


	

}
