package com.ankush.spring.Collection.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tests {

	public static void main(String arg[]) {
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext("com/ankush/spring/Collection/standalone/standaloneconfig.xml");
		
		Person per = context.getBean("person1",Person.class);
		System.out.println(per);
		
	}
}
