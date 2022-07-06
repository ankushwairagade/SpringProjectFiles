package com.ankush.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/ankush/springcore/lifecycle/sconfig.xml");
		
		/*
		 * Samosa sa = (Samosa)context.getBean("samosa"); System.out.println(sa);
		 * 
		 * // registering shutdown hook context.registerShutdownHook();
		 * 
		 * System.out.println("++++++++++++++++++++");
		 * 
		 * Pepsi p = (Pepsi)context.getBean("pepsi"); System.out.print(p);
		 */
		
		
		Jalebi jb =(Jalebi)context.getBean("jalebi");
		System.out.println(jb);
	}

}
