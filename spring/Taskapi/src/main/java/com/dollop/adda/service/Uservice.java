package com.dollop.adda.service;

import java.util.List;

import com.dollop.adda.bean.User;



public interface Uservice {
     
	  public User save(User user);
	  
	  public  List<User> findAllUser();
	  
	  public void deleteUser(Integer id);
	  
	  public User getUser(Integer id);
	  
	  public  User updateUser(User user);
}
