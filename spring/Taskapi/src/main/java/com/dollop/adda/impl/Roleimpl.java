package com.dollop.adda.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dollop.adda.Repo.RoleRepo;
import com.dollop.adda.bean.Role;
import com.dollop.adda.bean.User;
import com.dollop.adda.service.Rservice;
@Service
public class Roleimpl implements Rservice{

	@Autowired
	private RoleRepo res;

	@Override
	public Role save(Role role) {
		// TODO Auto-generated method stub
		return this.res.save(role);
	}

	@Override
	public List<Role> findAllRole() {
		// TODO Auto-generated method stub
		return this.res.findAll();
	}

	@Override
	public void deleteRole(Integer id) {
		// TODO Auto-generated method stub
		res.deleteById(id);
	}

	@Override
	public Role updaterole(Role role) {
		// TODO Auto-generated method stub
		return this.res.save(role);
	}

	@Override
	public String getRoleByUserId(Integer id) {
		// TODO Auto-generated method stub
		Role ub = this.res.findById(id).get();
		return ub.getRname();
	}

	@Override
	public Map<Integer, String> getMappedRoles() {
		// TODO Auto-generated method stub
		List<Role> list = this.res.findAll();
		Map<Integer,String> map = new HashMap<>();
		list.forEach(l->{
			map.put(l.getRid(), l.getRrole());
			
		});
		return map;
	} 
	


}
