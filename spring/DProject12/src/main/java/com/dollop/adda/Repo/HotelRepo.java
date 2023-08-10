package com.dollop.adda.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dollop.adda.bean.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, Integer> {

}
