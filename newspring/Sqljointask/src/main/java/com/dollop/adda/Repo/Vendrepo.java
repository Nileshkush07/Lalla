package com.dollop.adda.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.adda.bean.Vendor;

public interface Vendrepo extends JpaRepository<Vendor, Integer> {

}
