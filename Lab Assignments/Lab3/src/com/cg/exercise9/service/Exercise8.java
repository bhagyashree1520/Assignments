package com.cg.exercise9.service;

import java.util.Scanner;

public class Exercise8 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the string:");
		String str1 = sc.nextLine();
		boolean b = positiveString(str1);
		if(b==true)
		   System.out.println("Entered String is Positive");
		else
			System.out.println("Entered String is Negative");
	}
	private static boolean positiveString(String str1) {
		String str2 = str1.toLowerCase();
		  int cnt=0;
		  for(int i=0;i<str2.length()-1;i++)
		  {
			  if(str2.charAt(i)<str2.charAt(i+1))
				  cnt++;
		  }
		  if(cnt+1==str2.length())
			  return true;
		  else
			  return false;
	}

}
