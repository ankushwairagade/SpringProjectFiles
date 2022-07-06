package com.ankush.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	ApplicationContext context = new ClassPathXmlApplicationContext("com/ankush/springcore/javaconfig/config.xml");
		ApplicationContext context = 
	new AnnotationConfigApplicationContext(JavaConfig.class);	
		
		Student st = context.getBean("getStudent",Student.class);
		System.out.print(st);
			st.print();

	}

}
