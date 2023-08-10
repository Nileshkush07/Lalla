package com.dollop.adda.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dollop.adda.bean1.Product;
import com.dollop.adda.bean2.Model;
import com.dollop.adda.modprepo.ModelRepo;
import com.dollop.adda.prodrepo.ProductRepo;
@Component
public class Collrunner implements CommandLineRunner {
@Autowired
	private ProductRepo rr;
@Autowired
private ModelRepo repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*
		 * Product pro=new Product(); pro.setPid(12); pro.setCode("M1");
		 * 
		 * 
		 * 
		 * 
		 * Model mod=new Model(); mod.setMid(11); mod.setMcode("N1");
		 * mod.setMdata("hui"); List<Model> list=new ArrayList<Model>(); list.add(mod);
		 * 
		 * repo.save(mod); rr.save(pro);
		 */
		Model m1 = new Model(1012, "XYZ-A", "4GB-128GB-RED");
		Model m2 = new Model(1013, "XYZ-B", "6GB-256GB-GREEN");
		Model m3 = new Model(1014, "MN-C", "12GB-512GB-PINK");
		Model m4 = new Model(1011, "MN-D", "2GB-64GB-BLACK");
		
		Product p1 = new Product(10, "ABCD-XYZ", Arrays.asList(m1,m2));
		Product p2 = new Product(11, "ABCD-MN", Arrays.asList(m3,m4));
		
		repo.save(m1);
		repo.save(m2);
		repo.save(m3);
		repo.save(m4);
		
		rr.save(p1);
		rr.save(p2);
		
		
		
		
	}


	}


