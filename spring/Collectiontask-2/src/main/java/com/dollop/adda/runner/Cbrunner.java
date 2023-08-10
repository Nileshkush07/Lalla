package com.dollop.adda.runner;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dollop.adda.bean1.College;
import com.dollop.adda.bean2.Branch;
import com.dollop.adda.collegerepo.CollegeRepo;
import com.dollop.adda.collegerepo2.Branchrepo;
@Component

public class Cbrunner implements CommandLineRunner {
	@Autowired
	
	private CollegeRepo rr;
	@Autowired
	private Branchrepo repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		College col=new College();
		col.setCid(1);
		col.setCcode("Lalla");
		col.setCname("Mayank");
		
		Branch ba=new Branch();
		ba.setBid(3);
		ba.setBcode("hui");
		ba.setBname("hurr");
		
		 List<Branch> list=new ArrayList<Branch>(); 
		 list.add(ba);
		 
		 rr.save(col);
		 repo.save(ba);

	}

}
