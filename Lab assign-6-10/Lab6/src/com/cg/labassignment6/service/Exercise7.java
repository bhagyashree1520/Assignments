package com.cg.labassignment6.service;

import java.util.*;


public class Exercise7 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size of the array:");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		System.out.println("Before Reverse AND SORT:");
		for(int i=0;i<arr.length;i++)
	    	   System.out.print(arr[i]+"  ");
	       
		System.out.println("After Reverse AND SORT:");
		List <Integer> list = getSorted(arr);
	    	   System.out.println(list);   
	}
	private static List<Integer> getSorted(int[] arr) {		
		List <Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			Integer.toString(arr[i]);
			list.add(arr[i]);
		}
		
		for(int i=0,j=arr.length-1;i>(arr.length/2);i++,j--)
		{
			int temp = arr[i];
		    arr[i]=arr[j];
		    arr[j]=temp;
		}
		
		Collections.reverse(list);
		
		Collections.sort(list);
		return list;
		

	}

}
