package com.ankush.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component("firststudent")
public class Student {
	
	private Samosa samosa;
	

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}


	public Samosa getSamosa() {
		return samosa;
	}


	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}


	public void print() {
		System.out.println("Student learning spring boot");
		samosa.display();
	}
	
	
}
