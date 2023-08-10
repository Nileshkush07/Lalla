package com.dollop.app.task;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Task {
	
	@Value("Nilesh")
	private String stdname;
	@Value("Lalla")
	private String stdpassword;
	@Value("lalla.com")
	private String stdurl;
	/*public Task() {
		super();
	}
	public Task(String stdname, String stdpassword, String stdurl) {
		super();
		this.stdname = stdname;
		this.stdpassword = stdpassword;
		this.stdurl = stdurl;
	}
	public String getStdname() {
		return stdname;
	}
	public void setStdname(String stdname) {
		this.stdname = stdname;
	}
	public String getStdpassword() {
		return stdpassword;
	}
	public void setStdpassword(String stdpassword) {
		this.stdpassword = stdpassword;
	}
	public String getStdurl() {
		return stdurl;
	}
	public void setStdurl(String stdurl) {
		this.stdurl = stdurl;
	}
	@Override
	public String toString() {
		return "Task [stdname=" + stdname + ", stdpassword=" + stdpassword + ", stdurl=" + stdurl + "]";
	}
	*/
	

}
