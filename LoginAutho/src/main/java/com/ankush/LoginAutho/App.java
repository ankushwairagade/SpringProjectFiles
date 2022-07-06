package com.ankush.LoginAutho;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ankush.LoginAutho.Dao.AccountDao;
import com.ankush.LoginAutho.Entities.Account;


/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Old database ");

		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		AccountDao accountDao = (AccountDao) context.getBean("accountDao");

		Account acc = new Account();

		// read done
	//System.out.println(accountDao.readUser("ankush@kk"));

	
	/*	// create done
		// System.out.println( accountDao.createUser(acc));

		// delete done
		// System.out.println(accountDao.deleteUser("hela@kk"));

		// update
		// System.out.println(accountDao.updateUser(acc));
		*/
		menu(accountDao);

	}

	static void menu(AccountDao accountDao) {
		 boolean loop = true;

		while (loop) {
			System.out.println("1. Register Account");
			System.out.println("2. Login to DB");
			System.out.println("3. Delete Account");
			System.out.println("4. Update Info");
			System.out.println("5. show database");
			System.out.println("6. Exit");

			Scanner sc = new Scanner(System.in);
			System.out.println("choice any one option");
			int i = sc.nextInt();

			switch (i) {

			case 1: { // register account
				Account account = new Account();
				System.out.println("enter your first name");
				String fname = sc.next();
				System.out.println("enter your last name");
				String lname = sc.next();
				System.out.println("enter your email address");
				String email = sc.next();
				System.out.println("Enter your password");
				String ps1 = sc.next();
				System.out.println("re-enter your password");
				String ps2 = sc.next();

				if (ps1.equals(ps2)) {

					account.setFname(fname);
					account.setLname(lname);
					account.setEmail(email);
					account.setPassword(ps2);

					System.out.println("Successfully added " + accountDao.createUser(account));
				} else {
					// password not match
					System.out.println("Password not match ");
				}

				break;
			}
			case 2: { // login
				System.out.println("enter your email ");
				String email = sc.next();
				System.out.println("enter your password ");
				String password = sc.next();

				Account acc = accountDao.loginUser(email, password);

				if (acc.getFname() != null && acc.getLname() != null) {
					System.out.println("Success login ");
				} else {
					System.out.println("credential  not matched ");
				}

				break;
			}
			case 3: { // delete
				System.out.println("Enter your email address");
				String email = sc.next();
				System.out.println("Enter your Password");
				String password = sc.next();
				int r = accountDao.deleteUser(email, password);

				if (r == 1) {
					System.out.println("Successfully Deleted you account");
				} else {
					System.out.println("Credential not Matched");
				}

				break;
			}

			case 4: {
				// update info
				Account account = new Account();
				System.out.println("enter your first name");
				String fname = sc.next();
				System.out.println("enter your last name");
				String lname = sc.next();
				System.out.println("enter your email address");
				String email = sc.next();
				System.out.println("Enter your password");
				String ps1 = sc.next();
				System.out.println("re-enter your password");
				String ps2 = sc.next();
				
				if (ps1.equals(ps2)) {

					account.setFname(fname);
					account.setLname(lname);
					account.setEmail(email);
					account.setPassword(ps2);

					System.out.println("Successfully Updated your account " + accountDao.updateUser(account));
				} else {
					// password not match
					System.out.println("Password not match ");
				}

				break;
			}
			case 5:
				List<Account> account=accountDao.readDB();
					for(Account a:account)
					{
						System.out.println(a+"\n\n");
					}
				break;
			case 6:
				loop=false;
				break;

		   default:  System.out.print("Wrong input try again");
		   			
			}

		}

	}

}
