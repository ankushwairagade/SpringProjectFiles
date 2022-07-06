package com.ankush.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ankush.springorm.dao.StudentDao;
import com.ankush.springorm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
    	StudentDao studentDao = context.getBean("studentDao", StudentDao.class);  
    			
    	Student student=new Student(21,"ankush","MH");
    	int r= studentDao.insert(student);
    	
    	System.out.println(r);
    }
}
