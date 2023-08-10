package com.dollop.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.app.entity.Album;

public interface AlbumRepo extends JpaRepository<Album, Long> {
	public Optional<Album> findById(Long id);
}
