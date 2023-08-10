package com.dollop.adda.Repo2;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.adda.bean2.Department;

public interface DepartmentRepo extends JpaRepository<Department, Integer> {

}
