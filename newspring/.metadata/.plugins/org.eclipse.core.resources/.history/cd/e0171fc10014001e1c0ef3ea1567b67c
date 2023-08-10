package com.dollop.adda.bean;

import javax.persistence.Entity;
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
@Table(name="address")
public class Address {
@Id
	private Integer ad_id;
	
	private String ad_street;
	
	private String ad_suite;
	
	private String ad_city;
	
	private Integer ad_pincode;
	
    private String created_at;
	
	private String updated_at;
	
	private String created_by;
	
	private String updated_by;
	
	@ManyToOne
	@JoinColumn(name="g_id")
	private Geo geo;
	
	
	
	
	
}
