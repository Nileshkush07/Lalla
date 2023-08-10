package com.dollop.adda.bean;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="prd")
public class Product {
	@Id
 private Integer pid;
 
 private String pcode;
@ManyToOne
 private Vendor vendor;
 
}
