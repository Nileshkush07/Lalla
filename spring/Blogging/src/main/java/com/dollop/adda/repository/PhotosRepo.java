package com.dollop.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.app.entity.Photos;

public interface PhotosRepo extends JpaRepository<Photos, Long>{
	Optional<Photos> findById(Long id);
	Optional<Photos> findByTitle(String fileName);



}
