package com.cg.eis.pl;

import java.time.LocalDate;
import java.util.*;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

public class EmployeeTest {
private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		Map<Integer,Employee> employeeMap= new HashMap<>(); 
		   Employee e1= new Employee(1010,"Smith",98769.80); 
//		   Employee e2= new Employee(1000,"Clarke",298769.00); 
//		   Employee e3= new Employee(1005,"Jones",198769.50); 
//		   Employee e4= new Employee(1002,"Vinay",698769.00);
		   
		   
		
		
		EmployeeService emp = new EmployeeServiceImpl(); 
		for(int i=0;i<1;i++)
		 emp.getEmployeeDetails(e1);
		 System.out.println("Insurance Scheme : "+emp.findInsuranceScheme(e1));
		
		emp.showEmployeeDetails(e1);
		
		System.out.println("Enter insurance scheme:");
		String is = sc.nextLine();
		
		emp.showEmployeeDetailsBasedOnScheme(is);
	
		emp.DeleteEmployeeDeatils();
		
		emp.showEmployeeDetails(e1);
	}

}
