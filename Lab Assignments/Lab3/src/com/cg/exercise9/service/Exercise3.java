package com.cg.exercise9.service;

import java.util.Scanner;

public class Exercise3  
{ 
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
    { 
		System.out.println("Enter String:");
        String s = sc.nextLine(); 
        System.out.println(replaceConsonants(s.toCharArray())); 
    } 
  
    static boolean isVowel(char ch) 
    { 
        if (ch != 'a' && ch != 'e' && ch != 'i'
                && ch != 'o' && ch != 'u')  
        { 
            return false; 
        } 
        return true; 
    } 
 
    static String replaceConsonants(char[] s)  
    { 
        for (int i = 0; i < s.length; i++) 
        { 
            if (!isVowel(s[i])) 
            {
                if (s[i] == 'z')  
                    s[i] = 'b'; 
                else
                {
                     s[i] = (char) (s[i] + 1); 
                    if (isVowel(s[i]))  
                        s[i] = (char) (s[i] + 1);
                } 
            } 
        } 
        return String.valueOf(s); 
    } 
  
    
}  