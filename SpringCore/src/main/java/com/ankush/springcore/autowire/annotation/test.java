package com.ankush.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	
	public static void main(String [] args)
	{
		
		ApplicationContext context =
				new ClassPathXmlApplicationContext("com/ankush/springcore/autowire/annotation/autoconfig.xml");		
		Emp ad= context.getBean("emp",Emp.class);
		System.out.println(ad);
	}

}
