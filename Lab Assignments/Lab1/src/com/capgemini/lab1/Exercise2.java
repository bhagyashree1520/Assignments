package com.capgemini.lab1;

import java.util.Scanner;

public class Exercise2 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Your choice:");
		String buttton = sc.nextLine();
		
		switch(buttton.toLowerCase())
		{
		case "red": System.out.println("Stop");
		            break;
		case "yellow":System.out.println("Ready");
		             break;
		case "green":System.out.println("Go");         
		              break;
		}
		

	}

}
