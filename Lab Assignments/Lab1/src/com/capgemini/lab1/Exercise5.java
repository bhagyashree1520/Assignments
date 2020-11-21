package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise5 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		int n = sc.nextInt();
		int sum=calculateSum(n);
System.out.println("sum = "+sum);
	}
	private static int calculateSum(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		
		return sum;
	}

}
