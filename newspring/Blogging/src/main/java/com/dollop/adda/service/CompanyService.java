package com.dollop.app.service;

import com.dollop.app.entity.Company;
public interface CompanyService {
	Company save(Company cmpn);
	Company getCompany(Long id);
}
