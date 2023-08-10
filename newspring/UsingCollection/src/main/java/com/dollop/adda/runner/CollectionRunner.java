package com.dollop.adda.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dollop.adda.Repo.CollectionRepo;
import com.dollop.adda.Repo2.DepartmentRepo;
import com.dollop.adda.bean1.Employee;
import com.dollop.adda.bean2.Department;

@Component
public class CollectionRunner implements CommandLineRunner {
	@Autowired
	private CollectionRepo rr;
	@Autowired
	private DepartmentRepo repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Employee e=new Employee();
		e.setEmpid(5);
		e.setEmpname("Nilesh");
		e.setEmpsalary(100000);
		
		Department dep=new Department();
		dep.setDId(1);
		dep.setDname("Lalla");
		dep.setDadmin("Gujju");
		e.setDepartment(dep);
		
		//rr.save(e);
		repo.save(dep);
		rr.save(e);
	
		
		
		
	}

}
