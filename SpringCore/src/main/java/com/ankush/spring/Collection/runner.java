package com.ankush.spring.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context =
				new ClassPathXmlApplicationContext("com/ankush/spring/Collection/collectionconfig.xml");
		
		Emp emp = (Emp) context.getBean("Emp");
		System.out.println(emp);
		
	}

}
