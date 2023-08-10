package com.dollop.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.app.entity.Company;

public interface CompanyRepo extends JpaRepository<Company, Long> {

}
