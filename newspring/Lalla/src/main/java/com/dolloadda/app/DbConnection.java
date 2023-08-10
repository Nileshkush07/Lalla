package com.dolloadda.app;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;



@Component
@ConfigurationProperties("my.db")
@Data
public class DbConnection {
	private String stdname;
	private Integer stdid;

}
