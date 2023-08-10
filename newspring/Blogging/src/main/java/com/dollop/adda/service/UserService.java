package com.dollop.app.service;

import java.security.Principal;
import java.util.List;

import com.dollop.app.entity.Album;
import com.dollop.app.entity.Posts;
import com.dollop.app.entity.User;

public interface UserService {
	User login(String userName, String pass);
	User signUp(User user);
	User getUserByUserName(String userName);
	List<Posts> getPostsByUserName(String userName);
	List<Album> getAlbumsByUserName(String userName);
	String checkAvailabilityByUsername(String userName);
	String checkAvailabilityByEmail(String email);
	User addUserByAdmin(User user);
	User updateUserByAdmin(String username,User user);
	String userDelete(String username,Principal principal);
	User getLoginUser(Principal principal);
	String giveAdmin(String username,Principal principal);
	String takeAdmin(String username,Principal principal);
}
