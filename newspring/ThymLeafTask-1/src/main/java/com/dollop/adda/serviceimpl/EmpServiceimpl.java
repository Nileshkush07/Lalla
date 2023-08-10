package com.dollop.adda.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.dollop.adda.Iservice.EmpService;
import com.dollop.adda.Repo.EmpRepo;
import com.dollop.adda.bean.Employee;
@Service
public class EmpServiceimpl implements EmpService{
	@Autowired
	private EmpRepo repo;

	@Override
	public Employee save(Employee emp) {
		// TODO Auto-generated method stub
		return this.repo.save(emp);
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return this.repo.findAll();
	}

	@Override
	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		 this.repo.deleteById(id);
	}

	@Override
	public Employee getEmployee(Integer id) {
		// TODO Auto-generated method stub
		return this.repo.getById(id);
	}

	@Override
	public Employee updateEmployee(Integer id) {
		// TODO Auto-generated method stub
		Optional<Employee> optional=repo.findById(id);
		Employee emp=null;
		if(optional.isPresent())
		{
			emp=optional.get();
		}
		else
		{
			throw new RuntimeException("employee  not found");
		}
		return emp;
		
		
	}

}
