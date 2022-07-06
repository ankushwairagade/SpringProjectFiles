package com.ankush.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	
	
	public static void main(String [] args)
	{
		
		ApplicationContext context;
		context = new ClassPathXmlApplicationContext("com/ankush/springcore/autowire/autoconfig.xml");		
		Emp ad= (Emp)context.getBean("emp");
		System.out.println(ad);
	}

}
