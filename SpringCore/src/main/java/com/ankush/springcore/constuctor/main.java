package com.ankush.springcore.constuctor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		ApplicationContext con = new ClassPathXmlApplicationContext("com/ankush/springcore/constuctor/ciconfig.xml");
		
		Person p = (Person) con.getBean("Person");
		
		System.out.print(p);
	
	}

}
