package com.dollop.adda.bean;




import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="grpvarient")
public class GrpVarient {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer v_id;
	
	private String v_name;
	
	/*
	 * @ManyToOne
	 * 
	 * @ElementCollection
	 * 
	 * @JoinColumn(name="pg_id") private Prodgroup pdgrp;
	 */
	@ManyToOne
	@JoinColumn(name="pg_id")
	private Prodgroup pg;
}
