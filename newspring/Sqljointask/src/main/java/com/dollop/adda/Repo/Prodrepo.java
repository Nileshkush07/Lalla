package com.dollop.adda.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dollop.adda.bean.Product;

public interface Prodrepo extends JpaRepository<Product, Integer> {
	
	@Query("Select prd.pid from prd Left Join ven On prd.pid=ven.vid")
	public List<Integer> prdlist();

}
