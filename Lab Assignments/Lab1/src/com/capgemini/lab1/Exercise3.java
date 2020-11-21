package com.capgemini.lab1;

import java.util.Scanner;



public class Exercise3 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Number:");
		int n = sc.nextInt();
		int result =  usingNonRecursive(n);
		System.out.println("Nth number in Fibonacci series using NonRecursive Function:"+result);
		int result2 =  usingRecursive(n);
		System.out.println("Nth number in Fibonacci series using Recursive Function:"+result2);
		
	}
	 static int usingRecursive(int n) {
		 if (n <= 1) 
		        return n; 
		    return usingRecursive(n-1) + usingRecursive(n-2); 
	}
	private static int usingNonRecursive(int n) {
		int t1=1,t2=1,sum=0;
		for(int i=2;i<n;i++)
		{
			sum=t1+t2;
			t1=t2;
			t2=sum;
		}
		return sum;

	}

}
