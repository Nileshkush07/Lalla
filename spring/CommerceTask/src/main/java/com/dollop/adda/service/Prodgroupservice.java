package com.dollop.adda.service;

import java.util.List;

import com.dollop.adda.bean.Prodgroup;

public interface Prodgroupservice {

	public List<Prodgroup> getProdgroup();
	
	public Prodgroup getProdgroup(Integer id);
	
public 	Prodgroup save(Prodgroup prodgroup);

public Prodgroup updateProdgroup(Prodgroup prodgroup);
	
}
