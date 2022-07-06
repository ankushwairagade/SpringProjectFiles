package com.ankush.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public Samosa getSamosa()
	{
	return new Samosa();
	}
	
	
	@Bean
	public Student getStudent(){
		
		Student stud = new Student(getSamosa());
		return stud;
	}
	
	
}
