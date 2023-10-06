package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.springcore.javaconfig.Samosa;

//@Component("firststudent")
//@Component
public class Student {

//	@Autowired
	private Samosa samosa;
	
	public void study() {
		this.samosa.display();
		System.out.println("Student is reading book");
	}

	
	public Samosa getSamosa() {
		return samosa;
	}	

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}
	
//	public Student() {
//	super();
//}
//
	
	
}
