package com.ankush.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ankush.entities.Student;
import com.ankush.studentDao.StudentDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        @SuppressWarnings("resource")
        // XML Config
        //		ApplicationContext context = new ClassPathXmlApplicationContext("com/ankush/springjdbc/config.xml");
    
        // JavaBased Config
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfigJava.class);
       
        
        // JdbcTemplate template =  context.getBean("jTemplate",JdbcTemplate.class);
      
     StudentDao studentDao =context.getBean("studentDao",StudentDao.class);
     
     Student  student = new Student();
     //  Data insertion
     /*
		 * student.setId(1212); student.setName("hello world"); student.setCity("USA");
		 * 
		 * System.out.println( " student added  "+ studentDao.insert(student));
		 */  
     
     
     //  Data updation
		/*
		 * student.setId(1212); student.setCity("LA"); student.setName("Rohit");
		 * 
		 * System.out.println(" "+studentDao.change(student));
		 */
     
     // Delete the Data 
     
     //System.out.println("Delete " +studentDao.delete(39));
     
     // Selecting or getting single data
     
     System.out.println(studentDao.getStudent(1212)+"\n\n\n");
    
     // Multiple row data fetching 
     
     List<Student> students=studentDao.getAllStudent();
     
     for(Student s:students)
     {
    	 System.out.println(s+"\n");
     }
    }
}
