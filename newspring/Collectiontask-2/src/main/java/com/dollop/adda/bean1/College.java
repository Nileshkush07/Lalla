package com.dollop.adda.bean1;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dollop.adda.bean2.Branch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="collg")
//@SpringBootApplication
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cid;
	
	private String cname;
	
	private String ccode;
	@OneToMany(cascade = CascadeType.ALL)
	@ElementCollection
	//@CollectionTable(name = "branch", joinColumns = @JoinColumn(name = "bidFK"))
	@JoinColumn(name="bid")
	private List<Branch> branches;

}
