package com.dollop.adda.service;



import java.util.List;

import com.dollop.adda.bean.User;

public interface Userservice {
	
	public User registerUser(User user);
	
	public User loginuser(Integer id);
	
	public  List<User> getUser();
	
	public User getUser(Integer id);
	

}
