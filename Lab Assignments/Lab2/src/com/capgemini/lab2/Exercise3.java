package com.capgemini.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size of the array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		System.out.println("Before Reverse AND SORT:");
		for(int i=0;i<arr.length;i++)
	       {
	    	   System.out.println(arr[i]);
	       }
		System.out.println("After Reverse AND SORT:");
		int reverseArray[] = getSorted(arr);
		for(int i=0;i<arr.length;i++)
	       {
	    	   System.out.println(reverseArray[i]);
	       }
	       
	}
	private static int[] getSorted(int[] arr) {
	
		int j=0;
		int rev[] = new int[arr.length];
		
		for(int i=arr.length-1;i>=0;i--)
		{
			
		  rev[j]=arr[i];
		  j++;
		}
		Arrays.sort(rev);
		return rev;
	}
	

	

}
