package com.dollop.adda.bean2;

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
@Table(name="mod")
public class Model {
	@Id
	private Integer mid;
	
	private String mcode;
	private String mdata;
	

}
