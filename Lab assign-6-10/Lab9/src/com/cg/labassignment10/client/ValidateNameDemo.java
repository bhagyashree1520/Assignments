package com.cg.labassignment10.client;

import java.util.Scanner;

import com.cg.labassignment10.service.ValidateName;

public class ValidateNameDemo {
private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Username:");
		String userName = sc.nextLine();
		System.out.println("Enter Password:");
		String password = sc.nextLine();
		
		ValidateName vn = (u,p)->{
			if(u.equals("bhagya") && (p.equals("Bhagya@9298")))
				return true;
			else
				return false;
		};
		
		Boolean b = vn.validateUsername(userName,password);
		if(b==true)
		    System.out.println("Username and Password is Valid:");
		else
			System.out.println("Username and Password is Invalid:");
	}

}
