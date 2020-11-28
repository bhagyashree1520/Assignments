package com.cg.labassignment10.client;

import java.util.Scanner;

import com.cg.labassignment10.service.FormatString;

public class FormatStringDemo{
private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter String:");
		String s1 = sc.nextLine();
		
		FormatString fs = (x)->{
			
			
			StringBuilder sb = new StringBuilder(x);
			StringBuilder sb1 = new StringBuilder();
			int k=0;
			for(int i=0;i<(x.length()*2-1);i++)
			{
			   if(i%2!=0)
				sb1.insert(i, ' ');
			   else
			   {
				   sb1.insert(i, x.charAt(k));
				   k++;
			   }
			}
			return sb1;
			
		};
		System.out.println("Resultant String  :"+fs.insertSpace(s1));

	}

	

}
