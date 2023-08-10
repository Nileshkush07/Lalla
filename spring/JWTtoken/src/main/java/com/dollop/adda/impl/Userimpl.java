package com.dollop.adda.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.dollop.adda.Repo.UserRepo;
import com.dollop.adda.bean.User;
import com.dollop.adda.service.Userservice;

@Service
public class Userimpl implements Userservice,UserDetailsService{
	
	@Autowired
	private UserRepo ur;
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	@Override
	public Integer saveUser(User user) {
		user.setUpassword(passwordEncoder.encode(user.getUpassword()));
	      return ur.save(user).getUid();
	}

	@Override
	public User findbyuname(String uname) {
		Optional<User> optional=ur.findByUname(uname);
		if(optional.isPresent())
			return optional.get();
		else
			throw new UsernameNotFoundException(uname+"Not Exist");
	}

	@Override
	public UserDetails loadUserByUsername(String username){
		  Optional<User> findByUserEmail = ur.findByUname(username);
		    if(findByUserEmail.isPresent())
		    {
		    	User user=findByUserEmail.get();
		    	List<GrantedAuthority> authority = user.getRoles()
		    			.stream()
		    			.map(role->new SimpleGrantedAuthority(role))
		    			.collect(Collectors.toList());
		    	return new org.springframework.security.core.userdetails.User(username,user.getUpassword(),authority);
		    }
		    else
		    {
		    	throw new UsernameNotFoundException(username+"Not Exist");
		    }
	}
	
	
	@Override
	public Optional<User> getUserById(Integer Id) {
		return ur.findById(Id)
;
	}
}
