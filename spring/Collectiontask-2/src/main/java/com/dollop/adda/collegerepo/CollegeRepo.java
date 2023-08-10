package com.dollop.adda.collegerepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.adda.bean1.College;

public interface CollegeRepo extends JpaRepository<College, Integer> {

}
