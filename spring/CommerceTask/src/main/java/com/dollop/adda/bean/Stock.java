package com.dollop.adda.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="stocks")
public class Stock {

	
	@Id
	private Integer id;
	
	private String productName;
	
	private String varientName;
	
	private Integer stock;
}
