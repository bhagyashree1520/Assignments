package com.cg.lab5.client;

import java.util.Scanner;

import com.cg.lab5.service.EmployeeNameException;

public class EmployeeNameTester {
 private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try
		{
			System.out.println("Enter First Name:");
			String fname = sc.nextLine();
			System.out.println("Enter Last Name:");
			String lname = sc.nextLine();
			if(fname.equals("")&&lname.equals(""))
			{
				throw new EmployeeNameException("First name and last name is blank");
			}
			System.out.println("Valid Employee Name");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
