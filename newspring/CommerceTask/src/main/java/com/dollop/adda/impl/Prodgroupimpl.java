package com.dollop.adda.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dollop.adda.Repo.ProdGroupRepo;
import com.dollop.adda.bean.Prodgroup;
import com.dollop.adda.service.Prodgroupservice;
@Service
public class Prodgroupimpl implements Prodgroupservice {

	@Autowired
	private ProdGroupRepo pgr;
	
	@Override
	public List<Prodgroup> getProdgroup() {
		// TODO Auto-generated method stub
		return this.pgr.findAll();
	}

	@Override
	public Prodgroup getProdgroup(Integer id) {
		// TODO Auto-generated method stub
		return this.pgr.findById(id).get();
	}

	@Override
	public Prodgroup save(Prodgroup prodgroup) {
		// TODO Auto-generated method stub
		return this.pgr.save(prodgroup);
	}

	@Override
	public Prodgroup updateProdgroup(Prodgroup prodgroup) {
		// TODO Auto-generated method stub
		return this.pgr.save(prodgroup);
	}

	
}
