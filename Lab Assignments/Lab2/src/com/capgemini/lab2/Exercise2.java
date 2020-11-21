package com.capgemini.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size of the array:");
		
			int n = Integer.parseInt(sc.nextLine());
			String []arr  = new String[n];
			
	       for(int i=0;i<arr.length;i++)
	       { 
	    	   arr[i]=sc.nextLine();
	       }
	       System.out.println("Before Sorting:");
	       for(int i=0;i<arr.length;i++)
	       {
	    	   System.out.println(arr[i]);
	       }
	       String result[]=sortStrings(arr);
	       System.out.println("After Sorting:");
	       for(int i=0;i<arr.length;i++)
	       {
	    	   System.out.println(arr[i]);
	       }
	       
	       

	}
	private static String[] sortStrings(String[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
	    
		return arr;
	}

}
