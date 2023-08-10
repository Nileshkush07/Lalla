package com.dollop.adda.Repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.adda.bean.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
