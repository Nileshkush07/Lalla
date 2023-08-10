package com.dollop.adda.srvice;

import java.util.Optional;

import com.dollop.adda.bean.User;

public interface Userservice {
	
	Integer saveUser(User user);
	
	Optional<User> getOneUser(Integer id);

}
