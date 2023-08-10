package com.dollop.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dollop.app.entity.Company;
import com.dollop.app.repository.CompanyRepo;
import com.dollop.app.service.CompanyService;
@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	private CompanyRepo cr;
	@Override
	public Company save(Company cmpn) {
		
		return this.cr.save(cmpn);
	}
	@Override
	public Company getCompany(Long id) {
		
		return this.cr.findById(id).get();
	}

}
