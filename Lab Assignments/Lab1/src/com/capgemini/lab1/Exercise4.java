package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise4 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter number:");
		int n = sc.nextInt();
		int cnt=0;
		System.out.print("Prime Numbers:");
		for(int i=2;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
			  if(i%j==0)
				cnt++;
			}
			if(cnt==2)
				System.out.print(i+" ");
			cnt=0;
		}

	}

}
