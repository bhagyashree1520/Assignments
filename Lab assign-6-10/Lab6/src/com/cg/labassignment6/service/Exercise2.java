package com.cg.labassignment6.service;

import java.util.*;

public class Exercise2 {
 private static Scanner sc = new Scanner(System.in);
 static final int MAX_CHAR = 256; 
	public static void main(String[] args) {
		System.out.println("Enter the size of character array:");
		int size = sc.nextInt();
		char [] arr = new char[size];
		
		System.out.println("Enter the character elements:");
		for(int i=0;i<size;i++)
			arr[i] = sc.next().charAt(0);
	    
		
		Map<Character,Integer> result ;
		result = countChars(arr);
		System.out.println(result);
	}
	private static Map<Character, Integer> countChars(char[] arr) {
		Map<Character, Integer> result = new HashMap<>();
		int count[] = new int[MAX_CHAR]; 
		
        for (int i = 0; i < arr.length; i++) 
            count[arr[i]]++; 
        
      
        for (int i = 0; i < arr.length; i++) { 
           
            int cnt = 0; 
            for (int j = 0; j <= i; j++) { 
                if (arr[i] == arr[j])  
                    cnt++;        
            } 
               
            if (cnt == 1)  
                result.put(arr[i],count[arr[i]] );
        } 
		return result;
	}

}
