package com.dollop.adda.bean;

import javax.persistence.Column;
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
@Table(name="book")
public class Book {
	@Id
	@Column(name="bid")
	private Integer bid;
	@Column(name="bname")
	private String Bname;
	@Column(name="bauthor")
	private String bauthor;
	@Column(name="bcost")
	private Integer bcost;
	@Column(name="btype")
	private String Btype;
	

}
