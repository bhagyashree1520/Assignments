package com.cg.labassignment6.service;

import java.util.*;


public class Exercise6 {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.println("How many records you want ?");
        Integer size = in.nextInt();
        for (int i = 0; i < size; i++) {
            Integer id = in.nextInt();
            Integer age = in.nextInt();
            map.put(id, age);
        }
       List<Integer> result =  getStudents(map);
       System.out.println("Eligible ID's For vote:"+result);
	}

	private static List<Integer> getStudents(Map<Integer, Integer> map) {
		List<Integer> result = new ArrayList<>();
		for(Map.Entry<Integer, Integer> e: map.entrySet())
		{
			if(e.getValue()>18)
				result.add(e.getKey());
		}
		return result;
	}

}
