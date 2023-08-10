package com.dollop.adda.bean;

import javax.persistence.Entity;
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
@Table(name="posttag")
public class Posttag {
@Id
    private Integer pt_id;
    
    
    @ManyToOne
    @JoinColumn(name="t_id")
    private Tags tags;
    
    @ManyToOne
    @JoinColumn(name="p_id")
    private Post post;
	
	
	
}
