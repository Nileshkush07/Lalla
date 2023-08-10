package com.dollop.adda.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.adda.bean.Rating;



public interface RatingRepo extends JpaRepository<Rating, Integer> {
	
	List<Rating> findByuid(Integer uid);
	
	List<Rating> findByhotelid(Integer id);

}
