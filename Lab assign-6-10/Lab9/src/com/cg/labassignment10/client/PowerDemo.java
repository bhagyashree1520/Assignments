package com.cg.labassignment10.client;

import java.lang.*;
import java.util.Scanner;

import com.cg.labassignment10.service.Power;
public class PowerDemo {
private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
	
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		Power p = (x,y)->(Math.pow(a, b));
        System.out.println(p.power(a, b));
	}

}
