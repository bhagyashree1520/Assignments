package com.cg.lab5.service;

public class EmployeeNameException extends Exception{
	private String msg;

	
	public EmployeeNameException() {
		super();
	}


	public EmployeeNameException(String msg) {
		super();
		this.msg = msg;
	}


	public String getMsg() {
		return msg;
	}
	

}
