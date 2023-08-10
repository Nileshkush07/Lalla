package com.dollop.adda.bean;

import javax.persistence.CascadeType;
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
@Table(name="orderitems")
public class OrderItem {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer oi_id;
	
	private String oi_price;
	@ManyToOne
	@JoinColumn(name="pid")
	private Product product;
	@ManyToOne
	@JoinColumn(name="o_id")
	private Order order;
	@ManyToOne
	@JoinColumn(name="v_id")
	private GrpVarient gv;
	
}
