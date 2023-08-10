package com.dollop.adda.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.adda.bean1.Employee;
import com.dollop.adda.bean2.Department;

public interface CollectionRepo extends JpaRepository<Employee, Integer> {

	
     
	
	
}
