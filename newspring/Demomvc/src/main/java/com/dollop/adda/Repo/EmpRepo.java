package com.dollop.adda.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.adda.emp.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer> {

}
