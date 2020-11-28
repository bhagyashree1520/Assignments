package com.cg.labassignment6.service;

import java.util.*;


public class Exercise5 {

	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter size of the array:");
		int n = sc.nextInt();
		Integer [] arr = new Integer[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		
		int secondSmall= getSecondSmallest(arr);
		System.out.println(secondSmall);

	}
	private static int getSecondSmallest(Integer[] arr) {
		
		List<Integer> list = new ArrayList<Integer>();
		Collections.addAll(list, arr);
		Collections.sort(list);
		return list.get(1);
	}
		

}
