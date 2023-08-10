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
@Table(name="cartitems")
public class CartItem {
	
	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer ci_id;
		
		private Integer ci_quantity;
		
		@JoinColumn(name="pid")
		@ManyToOne
		private Product product;
		@JoinColumn(name="v_id")
		@ManyToOne
		private GrpVarient gv;
		
		
	

}
