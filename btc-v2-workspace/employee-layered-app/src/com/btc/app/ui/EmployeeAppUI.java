package com.btc.app.ui;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

import com.btc.app.model.Employee;
import com.btc.app.service.EmployeeService;
import com.btc.app.service.EmployeeServiceImpl;

public class EmployeeAppUI {
	
	private Scanner scanner=new Scanner(System.in);
	private static EmployeeService service;
	
public EmployeeAppUI() throws SQLException {
	service=new EmployeeServiceImpl();
}
	
	public void addEmployee() {
		System.out.println("Enter Employee Details :  ");
		System.out.print("Employee ID : ");
		int employeeId=scanner.nextInt();
		System.out.print("Employee Name : ");
		String employeeName=scanner.next()+scanner.nextLine();
		System.out.print("Email : ");
		String email=scanner.next()+scanner.nextLine();
		
		System.out.print("Birth Date [yyyy-mm-dd] : ");
		String dobString=scanner.next()+scanner.nextLine();
		
		LocalDate dob=LocalDate.parse(dobString);
		
		Employee employee= new Employee(employeeId, employeeName, dob, email);
		
		Employee savedEmployee;
		try {
			savedEmployee = service.addEmployee(employee);
			System.out.println("Employee Added Successfully..");
			System.out.println(savedEmployee);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void showEmployee() {
		System.out.println("Enter Employee Details :  ");
		System.out.print("Employee ID : ");
		int employeeId=scanner.nextInt();
		
		Employee employee=null;
		try {
			employee = service.searchEmployeeById(employeeId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(employee);
	}
	
}
