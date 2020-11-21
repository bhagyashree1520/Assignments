package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise6 {

	

			private static Scanner sc = new Scanner(System.in);
			public static void main(String[] args) {
				
				System.out.println("Enter number:");
				int n = sc.nextInt();
				long difference=calculateDifference(n);
		System.out.println("difference = "+difference);

	}
			private static long calculateDifference(int n) {
				
				long sum = 0,sum1=0;
				for(int i=1;i<=n;i++)
				{
					sum+=(i*i);
					sum1+=i;
				}
				
				return sum-(sum1*sum1);
			}

}
