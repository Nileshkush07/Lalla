package com.dollop.adda.stdimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dollop.adda.Repo.StdRepo;
import com.dollop.adda.bean.Student;
import com.dollop.adda.stdService.Stdservice;
@Service
public class Stdimpl implements Stdservice {
	

	@Autowired
	private StdRepo sr;
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return this.sr.save(student);
	}

	@Override
	public List<Student> getallStudent() {
		// TODO Auto-generated method stub
		return this.sr.findAll();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return this.sr.save(student);
	}

	@Override
	public String deleteStudent(Integer Id) {
		if(sr.existsById(Id)) 
		{
			sr.deleteById(Id)
;
			return "user  deleted";
		}
		else {
			return "delete";
		}
	}

	@Override
	public Student getStudent(Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
