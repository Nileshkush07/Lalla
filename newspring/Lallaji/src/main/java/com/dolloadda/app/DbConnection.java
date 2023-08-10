package com.dolloadda.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@ConfigurationProperties("my.db")
@Component
@Data
public class DbConnection {
	
	private String stdname;
	private Integer stdid;

}
