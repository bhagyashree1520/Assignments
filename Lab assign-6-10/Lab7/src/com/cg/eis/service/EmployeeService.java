package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	
	 void getEmployeeDetails(Employee emp);
	 String findInsuranceScheme(Employee emp);
	 void showEmployeeDetails(Employee emp);
	void showEmployeeDetailsBasedOnScheme(String is);
	public void DeleteEmployeeDeatils();
	
}
