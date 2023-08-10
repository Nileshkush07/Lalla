package com.adda.app;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("my.db")

public class Emailconfig {
	
		private String host;
		private Integer port;
		private String user;
		private Boolean active;
		public String getHost() {
			return host;
		}
		public void setHost(String host) {
			this.host = host;
		}
		
		public Integer getPort() {
			return port;
		}
		public void setPort(Integer port) {
			this.port = port;
		}
		public String getUser() {
			return user;
		}
		public void setUser(String user) {
			this.user = user;
		}
		public Boolean getActive() {
			return active;
		}
		public void setActive(Boolean active) {
			this.active = active;
		}
		@Override
		public String toString() {
			return "EmailConfiig [host=" + host + ", port=" + port + ", user=" + user + ", active=" + active + "]";
		}
		public Emailconfig() {
			super();
			// TODO Auto-generated constructor stub
		}
		

	

}
