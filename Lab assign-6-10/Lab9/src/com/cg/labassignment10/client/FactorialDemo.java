package com.cg.labassignment10.client;

import java.util.Scanner;


import com.cg.labassignment10.service.Factorial;

public class FactorialDemo 
{

	public int factorial(int num)
	{
		int fact=1 ;
		for(int i=1;i<=num;i++)
		{
			fact =fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		FactorialDemo ex = new FactorialDemo();
		
		Factorial fact = ex::factorial;
		
		System.out.println("Factorial of "+num+" is "+fact.factorial(num));
		
		sc.close();
	}

}
