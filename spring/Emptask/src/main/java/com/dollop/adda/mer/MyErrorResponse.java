package com.dollop.adda.mer;

import com.dollop.adda.bean.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyErrorResponse {

	private String  date;
	private String Status;
	private Integer code;
	private String message;
	
}
