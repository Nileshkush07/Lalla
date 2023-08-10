package com.dollop.adda.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.adda.bean.Student;

public interface StdRepo extends JpaRepository<Student, Integer> {

}
