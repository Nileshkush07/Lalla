package com.dollop.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dollop.app.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {
	@Query("select u from User u where u.email = ?1 and u.password=?2")
	User findByUserNameAndpassword(String uName,String uPassword);
	
	
	User findUserByUserName(String userName);
	User findUserByEmail(String email);
	User findPostsByUserName(String userName);
	User findAlbumsByUserName(String userName);
	Boolean existsByUserName(String username);
	Optional<User> findByUserName(String userName);
//	void deleteByUserName(String username);
}
