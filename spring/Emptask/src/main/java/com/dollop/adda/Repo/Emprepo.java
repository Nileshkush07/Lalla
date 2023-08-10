package com.dollop.adda.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.adda.bean.Employee;

public interface Emprepo extends JpaRepository<Employee, Integer> {

}
