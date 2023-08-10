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
@Table(name="add")
public class Address {
	@Id
	private Integer aid;
	
	private String alocation;
	
	private Integer apincode;
	
	private String city;
	@ElementCollection
	@CollectionTable(name = "addres", joinColumns = @JoinColumn(name = "sidFK"))

}
