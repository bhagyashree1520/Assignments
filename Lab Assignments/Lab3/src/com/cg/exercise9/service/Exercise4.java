package com.cg.exercise9.service;

import java.util.Scanner;

public class Exercise4 {
private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter number:");
		int number = sc.nextInt();
		int result = modifyNumber(number);
		
		System.out.println("Modified Number is:"+result);

	}
	private static int modifyNumber(int number) {
		String s1 = Integer.toString(number);
		int j=1;
		int sum=0;
		int len = s1.length();
		while(len>0)
		{
			j=j*10;
			len--;
		}
		for(int i=0;i<s1.length()-1;i++)
		{ 
			int a=Character.getNumericValue(s1.charAt(i)); 
			int b=Character.getNumericValue(s1.charAt(i+1)); 
			sum = sum + (Math.abs(a-b)*(j=j/10));
		}
		sum = sum+Character.getNumericValue(s1.charAt(s1.length()-1));
		return sum;
	}

}
