package com.dollop.adda.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="orders")
public class Order {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer o_id;
	
	private String o_Address;
	
	private String o_City;
	
	private String o_comment;
	private String o_created;
	private String o_name;
	private String o_status;
	private String o_totalprice;
	private String o_type;
	private String o_zip;
	
	
	
	
	
}
