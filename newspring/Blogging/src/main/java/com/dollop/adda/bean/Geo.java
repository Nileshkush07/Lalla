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
@Table(name="geo")
public class Geo {
	@Id
	private Integer g_id;
	
	private String g_lat;
	
	private String g_lang;
	
    private String created_at;
	
	private String updated_at;
	
	private String created_by;
	
	private String updated_by;

}
