package com.cg.exercise9.service;

import java.util.Scanner;

public class Exercise2 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter String:");
		String s1 = sc.nextLine();
		StringBuffer sb = new StringBuffer(s1);
		
			System.out.println(s1+"|"+sb.reverse());
}
}