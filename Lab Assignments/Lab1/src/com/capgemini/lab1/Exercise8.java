package com.capgemini.lab1;
import java.util.Scanner;
import java.lang.Math; 

public class Exercise8 {

				private static Scanner sc = new Scanner(System.in);
				public static void main(String[] args) {
					
					System.out.println("Enter number:");
					int n = sc.nextInt();
					 boolean flag=checkNumber(n);
					 if(flag==true)
			       System.out.println(n+" is a power of 2");
					 else
						 System.out.println(n+" is not a power of 2"); 
 
		}
	private static boolean checkNumber(int n) {
		
		int j=1;
		boolean f=false;
		while(j<=n)
		{
			j=j*2;
		if(j==n)
			f=true;			
		}	

		if(f==true)
			return f;
	   else				
		   return f;

}
}