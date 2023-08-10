package com.dollop.app;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@ConfigurationProperties("my.db")
public class DBConnection {
   
	 private String Name;
	 private Integer id;
}
