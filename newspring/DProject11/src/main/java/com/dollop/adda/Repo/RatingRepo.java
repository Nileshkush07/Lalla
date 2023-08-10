package com.dollop.adda.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.adda.Entity.Rating;

public interface RatingRepo extends JpaRepository<Rating, Integer> {

}
