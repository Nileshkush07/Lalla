package com.dollop.adda.Service;

import java.util.List;

import com.dollop.adda.Entity.User;

public interface Userservice {
	
	User saveUser(User user);
	
	List<User> getAllUser();
	
	User getUser(Integer id);

}
