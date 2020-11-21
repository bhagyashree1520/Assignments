package com.capgemini.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter size of the array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		int secondSmall= getSecondSmallest(arr);
		System.out.println(secondSmall);

	}
	private static int getSecondSmallest(int[] arr) {
		Arrays.sort(arr);
		return arr[1];
	}

}
