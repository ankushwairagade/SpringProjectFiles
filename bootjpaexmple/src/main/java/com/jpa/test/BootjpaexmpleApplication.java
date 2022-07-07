package com.jpa.test;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.Entities.User;
import com.jpa.test.Service.UserService;



@SpringBootApplication
public class BootjpaexmpleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexmpleApplication.class, args);
		
		UserService userService = context.getBean(UserService.class);
		
//		User ob = new User();
//		ob.setId(1);
//		ob.setName("ankush");
//		ob.setPhone("998786678");
//		ob.setCity("chandrapur");
//		
//		userService.save(ob);
//		
		
		
		///User user =userService.findByName("gaurav");
		//	System.out.println(user);
		
			List<User> u;
		//	u = userService.getAllData();
			
			u =userService.getNativeUsers();
			for(User s:u)
			{
				System.out.println(u);
			}
			
			
			//System.out.println(" bbb   "+userService.getUser("gaurav"));
			
	//	menu(userService);
		
		
	}
	
	
	static void  menu(UserService userService)
    {   boolean loop=true;
        while(loop)
        {
            System.out.println("1. Save User");
            System.out.println("2. Show User Information");
            System.out.println("3. Update User Information");
            System.out.println("4. List All DataBase");
            System.out.println("5. Delete User with ID");
            System.out.println("6. Exit");

            Scanner sc =new Scanner(System.in);
            System.out.println("choice any one option");
            int i=sc.nextInt();


            switch (i) {

                case 1: { // Save User Info
                 	System.out.println("Creating New User");
                    System.out.println("enter your ID");
                    String Id = sc.next();
                    
                    System.out.println("enter your Full Name");
                    String fname = sc.next();
                    System.out.println("enter your Phone Number");
                    String phone = sc.next();
                    System.out.println("enter your City Name");
                    String city = sc.next();           
                    User ob = new User(Integer.parseInt(Id),fname,city,phone);

                    userService.save(ob);
                    
                    break;
                }
                case 2: { // show user data
                    System.out.println("enter your ID ");
                    String id = sc.next();
                   
                    System.out.println(userService.findById(Integer.parseInt(id)));
                   
                    break;
                }
                case 3: { // update your info
                	System.out.println("Update Existing User");
                	 System.out.println("enter your ID");
                     String Id = sc.next();
                     
                     System.out.println("enter your Full Name");
                     String fname = sc.next();
                     System.out.println("enter your Phone Number");
                     String phone = sc.next();
                     System.out.println("enter your City Name");
                     String city = sc.next();
                     
                     User ob = new User(Integer.parseInt(Id),fname,city,phone);

                     userService.save(ob);
                     
                        
                        }

                case 4: {   // Show All user 
                		
                	Iterable<User> obj = userService.findAll();
                	
                		for(User c : obj)
                		{
                			System.out.println(c);
                		}
                	
                    break;
                }
                case 5: System.out.println("enter your ID");
                		String Id = sc.next();
                		userService.deleteById(Integer.parseInt(Id));
                		break;
                case 6: loop=false; break;

            }

        }
        
    }
	

}
 