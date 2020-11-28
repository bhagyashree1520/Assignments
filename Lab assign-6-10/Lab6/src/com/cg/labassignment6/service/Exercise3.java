package com.cg.labassignment6.service;

import java.util.*;

public class Exercise3 {

	public static void main(String[] args) {
		List <Integer> list = new ArrayList <>();
		list.add(2);
		list.add(3);
		list.add(5);
		list.add(6);
		Map <Integer,Integer> result = getSquares(list);
        System.out.println("Number = Square of Number : \n"+result);
	}

	private static Map<Integer,Integer> getSquares(List<Integer> list) {
		Map<Integer,Integer> map = new HashMap<>();
		for(Integer i:list)
			map.put(i, i*i);
		
		return map;
	}

}
