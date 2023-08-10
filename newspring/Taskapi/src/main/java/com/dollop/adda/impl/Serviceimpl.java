package com.dollop.adda.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dollop.adda.Repo.Reposatry;
import com.dollop.adda.bean.User;
import com.dollop.adda.service.Uservice;
@Service
public class Serviceimpl implements Uservice{
@Autowired
	private Reposatry repo;
	
	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return this.repo.save(user);
	}

	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return this.repo.findAll();
		}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public User getUser(Integer id) {
		// TODO Auto-generated method stub
		return this.repo.findById(id).get();
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return this.repo.save(user);
	}

}
