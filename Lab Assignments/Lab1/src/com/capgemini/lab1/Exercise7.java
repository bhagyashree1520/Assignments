package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise7 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Number:");
		int number = sc.nextInt();
		boolean flag = checkNumber(number);
		if(flag==true)
		 System.out.println(number+" is an increasing Number.");
		else
			System.out.println(number+" is  not an increasing Number.");
	}
	private static boolean checkNumber(int number) {
		int cnt=0,cnt1=0;
		while(number!=0)
		{
			int n1=number%10;
			number = number/10;
			int n2=number%10;
			if(n1>n2)
				cnt++;
			cnt1++;
		} 
		if(cnt==cnt1)
		    return true;
		else
			return false;
	}

}
