package com.capgemini.lab2;

import java.util.Scanner;

public class Exercise4 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter size of the array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		System.out.println("Before Removing Duplicates:");
		for(int i=0;i<arr.length;i++)
	       {
	    	   System.out.println(arr[i]);
	       }
		System.out.println("After Removing Duplicates:");
		int result[] = modifyArray(arr);
		for(int i=0;i<result.length-1;i++)
	       {
	    	   System.out.println(result[i]);
	       }
	       
	}
	private static int[] modifyArray(int[] arr) {
		int len = arr.length;
		int[] res = new int[len];  
        int j = 0;  
        for (int i=0; i<len-1; i++){  
            if (arr[i] != arr[i+1]){  
            	{
                res[j] = arr[i];  
                j++;
            	}
                
            }  
         }  
        res[j++] = arr[len-1];     
		
		return res;
	}

}
