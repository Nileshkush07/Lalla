package com.dollop.service;

import com.dollop.adda.bean.User;

public interface Userservice {
	
	public User addUser(User user);
	
	public User getUser(Integer id);
	
	public User getprofileByusername(User username);

}
