package com.dollop.adda.bean;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="prodgrp")
public class Prodgroup {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pg_id;
	
	private String pg_name;
	
	private String pg_price;
	
	private String pg_created;
	
	@OneToMany
	@JoinColumn(name="v_idfk")
	public List<GrpVarient> grpvarient;
	
}
