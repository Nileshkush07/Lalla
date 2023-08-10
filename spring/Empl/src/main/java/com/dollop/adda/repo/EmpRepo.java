package com.dollop.adda.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dollop.adda.bean.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {
	
//1.Fetch single column data
	//@Query("select e.empName from Lalla e")
	//List<String>getAllEmpName();
	
	//@Query("SELECT e FROM lalla e")
	//List<Employee>getAllEmps();
	
	@Query("select e from Employee e where e.empname=:name")
	Optional<Employee>getEmployeeByempname(String name);

	    // @Query("select e from Lalla e where e.empsalary")
	     //List<Employee>getemployeeByempsalary(Integer empsalary);

}

