package com.ankush.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/ankush/springcore/stereotype/stereotypeconfig.xml");
		
	Student stud =	context.getBean("student",Student.class);
		System.out.println(stud.hashCode());
		
		Student stud2 =	context.getBean("student",Student.class);
		System.out.println(stud2.hashCode());
	}

}
