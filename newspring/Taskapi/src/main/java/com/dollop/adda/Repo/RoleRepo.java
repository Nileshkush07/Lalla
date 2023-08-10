package com.dollop.adda.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.adda.bean.Role;

public interface RoleRepo extends JpaRepository<Role, Integer> {

}
