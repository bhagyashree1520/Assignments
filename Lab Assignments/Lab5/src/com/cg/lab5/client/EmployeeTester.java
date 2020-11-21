package com.cg.lab5.client;

import java.util.Scanner;

import com.cg.lab5.service.EmployeeException;

public class EmployeeTester {
private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try
		{
			System.out.println("Enter the salary of an employee");
			long sal = sc.nextLong();
			if(sal<3000)
			{
				throw new EmployeeException("Invalid Salary");
			}
			System.out.println("Valid Salary");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
