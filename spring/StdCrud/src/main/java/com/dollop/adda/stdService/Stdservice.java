package com.dollop.adda.stdService;

import java.util.List;

import com.dollop.adda.bean.Student;



public interface Stdservice {
	
	public  Student saveStudent(Student student);
	
	public List<Student> getallStudent();
	
	public Student  updateStudent(Student student);
	
	public  String deleteStudent(Integer Id);
	
	public  Student getStudent(Integer Id);

}
