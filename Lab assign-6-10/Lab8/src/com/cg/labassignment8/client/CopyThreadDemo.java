package com.cg.labassignment8.client;

import com.cg.labassignment8.service.CopyThread;


public class CopyThreadDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread()); 
		Thread t1= new CopyThread("worker-1");
		t1.start();
		
		

	}

}
