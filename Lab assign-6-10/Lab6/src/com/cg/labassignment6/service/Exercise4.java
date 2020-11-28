package com.cg.labassignment6.service;

import java.util.*;
public class Exercise4 {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
	        Scanner in = new Scanner(System.in);
	        System.out.println("How many records you want ?");
	        Integer size = in.nextInt();
	        for (int i = 0; i < size; i++) {
	            Integer regNumber = in.nextInt();
	            Integer marks = in.nextInt();
	            map.put(regNumber, marks);
	        }
	       Map<Integer,String> result =  getStudents(map);
           System.out.println("{Registration Number = Medal Type}\n"+result);
	}

	private static Map<Integer, String> getStudents(Map<Integer,Integer> map) {
		Map<Integer, String> result = new HashMap<>();
		 for(Map.Entry<Integer,Integer> e : map.entrySet()) 
		 {
			 if(e.getValue()>=90)
				 result.put(e.getKey(), "Gold");
			 else if(e.getValue()>=80 && e.getValue()<90)
				 result.put(e.getKey(), "Silver");
			 else if(e.getValue()>=70 && e.getValue()<80)
				 result.put(e.getKey(), "Bronze");	 
		 }
		     
		return result;
	}

}
