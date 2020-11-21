package com.cg.lab5.service;

public class EmployeeException extends Exception{
	private String msg;

	
	public EmployeeException() {
		super();
	}


	public EmployeeException(String msg) {
		super();
		this.msg = msg;
	}
	
	public String getMessage() {
		return this.msg;
	}
}
