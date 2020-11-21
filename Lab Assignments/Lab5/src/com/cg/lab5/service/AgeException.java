package com.cg.lab5.service;

public class AgeException extends Exception{
	 private String msg;
	public AgeException()
	{
		
	}
	public AgeException(String msg) {
		super();
		this.msg = msg;
	}
	public String getMessage() {
		return this.msg;
	}
	
	

}
