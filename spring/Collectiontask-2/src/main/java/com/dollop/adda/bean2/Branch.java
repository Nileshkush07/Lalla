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
@Table(name="brnch")
public class Branch {
	@Id
	private Integer bid;
	
	private String bcode;
	
	private String bname;
	

}
