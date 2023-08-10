package com.dollop.adda.service;

import java.util.List;
import java.util.Map;



import com.dollop.adda.bean.Role;



public interface Rservice {

	  public Role save(Role role);
	  
	  public  List<Role> findAllRole();
	  
	  public void deleteRole(Integer id);
	  
	  public String getRoleByUserId(Integer id);
	
	public Role updaterole(Role role);
	
	public Map<Integer, String> getMappedRoles();
}
