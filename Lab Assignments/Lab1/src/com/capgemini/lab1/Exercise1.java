package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise1 {
private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter number:");
		int n = sc.nextInt();
		 int sum = sumOfCubeOfDigits(n);
	    System.out.println("Sum of cubes of digits : "+sum);
		
	}
	private static int sumOfCubeOfDigits(int n) {
		int sum=0;
		while(n!=0)
		{
			int s=n%10;
			sum = sum+(s*s*s);
			n=n/10;
		} 
		return sum;
	}

}
