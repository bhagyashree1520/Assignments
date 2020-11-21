package com.cg.exercise9.service;
	
	import java.util.Scanner;
	import java.util.StringTokenizer;

	public class Exercise1 {
		
		private static Scanner sc = new Scanner(System.in);
		public static void main(String[] args) {
			
			System.out.println("Enter Numbers:");
			String no=sc.nextLine();
			StringTokenizer st = new StringTokenizer(no," ");
			int sum=0;
			System.out.println("Entered Numbers are :");
			while(st. hasMoreTokens())
			{
				String num=st.nextToken();
			 System.out.print(num+" ");
			 sum=sum+Integer.parseInt(num);
			}
			System.out.println("\nSum of Numbers is: "+ sum);
		} 
	


}
