package com.dollop.adda.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.adda.bean.Post;

public interface PostRepo extends JpaRepository<Post, Integer> {

}
