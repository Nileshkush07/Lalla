package com.dollop.adda.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.adda.bean.Album;

public interface AlbumRepo extends JpaRepository<Album, Integer> {

}
