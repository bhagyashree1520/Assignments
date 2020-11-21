package com.cg.lab5.client;

import java.util.Scanner;

import com.cg.lab5.service.AgeException;



public class AgeTester {
	private static Scanner scanner=new Scanner(System.in);
	public static void main(String[] args) {
		try
		{
			System.out.println("Enter your age: ");
			int age= scanner.nextInt();
			if(age<15)
			{
				throw new AgeException("You are under-aged");
			}
			System.out.println("You are eligible ");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
