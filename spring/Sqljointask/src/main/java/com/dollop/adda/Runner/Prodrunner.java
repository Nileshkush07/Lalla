package com.dollop.adda.Runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dollop.adda.Repo.Prodrepo;
import com.dollop.adda.Repo.Vendrepo;
import com.dollop.adda.bean.Product;
import com.dollop.adda.bean.Vendor;
@Component
public class Prodrunner implements CommandLineRunner {
	@Autowired
	private Prodrepo rr;
	
	@Autowired
	private Vendrepo repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Product pro=new Product();
		pro.setPid(5);
		pro.setPcode("raj");
		
		
		Vendor ven=new Vendor();
		ven.setVid(5);
		ven.setVname("rahul");
		
		rr.save(pro);
		repo.save(ven);
		
		rr.prdlist().forEach(System.out::println);

	}

}
