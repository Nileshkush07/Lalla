package com.dollop.adda.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.adda.bean.Student;

public interface Repo extends JpaRepository<Student, Integer> {

}
