package com.cg.labassignment6.service;

import java.util.*;
import java.util.Map.Entry;


public class Exercise1 {

	public static void main(String[] args) {
		 Map<Integer, String> eMap= new HashMap<>(); 
		    eMap.put(1,"Aditya");
			eMap.put(4,"Bhagyashree");
			eMap.put(2,"Anita");
			eMap.put(3,"Asha");
		
		 List<Map.Entry<Integer, String> > list =  getValues(eMap);
         System.out.println(list);
	}

	private static List<Entry<Integer, String>> getValues(Map<Integer, String> eMap) {
		List<Map.Entry<Integer, String> > list = 
	               new LinkedList<Map.Entry<Integer, String> >(eMap.entrySet()); 
	  
	 
	        Collections.sort(list, new Comparator<Map.Entry<Integer, String> >() { 
	            public int compare(Map.Entry<Integer, String> o1,  
	                               Map.Entry<Integer, String> o2) 
	            { 
	                return (o1.getValue()).compareTo(o2.getValue()); 
	            }
				
	        }); 
	      
	        return list; 
	}

}
