package com.dollop.adda.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class MyErrorResponse {
	@Id
	private String  date;
	private String Status;
	private Integer code;
	private String message;

}
