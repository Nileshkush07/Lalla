package com.dollop.adda.service;

import java.util.List;

import com.dollop.adda.bean.Employee;

public interface empservice {

	
	  public  Employee saveEmployee(Employee employee);
		
		public List<Employee> getallEmployee();
		
		public Employee  updateEmployee(Employee employee);
		
		public  String deleteEmployee(Integer Id);
		
		public  Employee getEmployee(Integer Id);
}
