package com.dollop.adda.cbean;

import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.OrderColumn;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="prodTab")
public class Product {
	@Id
	@Column(name="pid")
	private Integer prodId;
	@Column(name="pcode")
	private String prodCode;
	@ElementCollection
	@CollectionTable(name="product_colors",joinColumns=@JoinColumn(name="pidFK"))
	@OrderColumn(name="pos")
	@Column(name="data")
	private List<String>colors;
	@ElementCollection
	@CollectionTable(name="product_Models",joinColumns=@JoinColumn(name="pidFK"))
	@Column(name="model")
	private Set<String>Models;
	@ElementCollection
	@CollectionTable(name="product_Details",joinColumns=@JoinColumn(name="pidFK"))
	@MapKeyColumn(name="code")
	@Column(name="deatils")
	private Map<String,String>Details;

}
