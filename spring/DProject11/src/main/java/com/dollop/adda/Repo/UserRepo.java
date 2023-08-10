package com.dollop.adda.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.adda.Entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
