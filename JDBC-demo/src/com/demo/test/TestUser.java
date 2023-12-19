package com.demo.test;

import com.demo.beans.User;
import com.demo.service.*;

import java.util.List;
import java.util.Scanner;

public class TestUser {

	public static void main(String[] args) {
		int ch = 0;
		Scanner sc= new Scanner(System.in);
		UserService service= new UserServiceImp();
		
		do {
			System.out.println("1. Insert data\n2. Get all data\n3. Get username\n4. Delete username\n5. Update password");
			System.out.println("Enter your choice:");
			ch= sc.nextInt();
			
			switch(ch) {
			case 1: 
				String uname,pwd;
				System.out.print("Enter username: ");
				uname= sc.next();
				System.out.print("Enter password: ");
				pwd= sc.next();
				service.addUser(uname,pwd);
				break;
			case 2:
				List<User> ulist = service.getAllUsers();
				System.out.println("All user data:-");
				for(User u: ulist) {
					System.out.println(u);
				}
				break;
			case 3:  
				List<String> unamelist = service.getAllUname();
				System.out.println("All usernames:-");
				for(String u: unamelist) {
					System.out.println(u);
				}
				break;
			case 4:
				System.out.print("Enter username: ");
				uname= sc.next();
				service.deleteByUsernm(uname);
				break;
			case 5:  
				//update pwd
				break;
			case 6:  
				System.out.println("🙏 Thank you 🙏");
				break;
			default: System.out.println("invalid choice !!!");
			}
		}while(ch!=3);

	}

}
