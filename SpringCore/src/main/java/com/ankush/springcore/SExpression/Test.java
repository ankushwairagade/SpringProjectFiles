package com.ankush.springcore.SExpression;

import java.beans.Expression;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ApplicationContext context = new ClassPathXmlApplicationContext("com/ankush/springcore/SExpression/config.xml");
		
		Demo d1 =context.getBean("demo",Demo.class);
		
		System.out.println(d1);
		
		/*
		 * SpelExpressionParser temp = new SpelExpressionParser();
		 * 
		 * Expression exp = (Expression) temp.parseExpression("22+44");
		 * 
		 * String msg = (String) exp.getValue();
		 * 
		 * System.out.print(msg);
		 */

	}

}
