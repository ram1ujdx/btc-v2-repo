package com.btc.app.service;

import java.util.List;

import com.btc.app.model.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee) throws Exception;
	
	public Employee searchEmployeeById(int employeeId);
	
	public boolean deleteEmployeeById(int employeeId);
	
	public Employee updateEmployee(Employee employee);
	
	public List<Employee> getAllEmployee();
	
	
}
