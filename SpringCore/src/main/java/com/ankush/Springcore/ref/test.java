package com.ankush.Springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new 
				ClassPathXmlApplicationContext("com/ankush/Springcore/ref/refconfig.xml");
		
			A temp = (A) context.getBean("Aref");
			System.out.println(temp.hashCode());
		
			A temp1 = (A) context.getBean("Aref");
			System.out.println(temp.hashCode());
				
	}

}
