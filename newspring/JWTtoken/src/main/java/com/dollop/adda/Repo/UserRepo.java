package com.dollop.adda.Repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.adda.bean.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	
	Optional<User> findByUname(String uname);

}
