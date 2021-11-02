package com.btc.app.dao;

import java.util.List;

import com.btc.app.model.Employee;

public interface EmployeeDao {
	
	public Employee addEmployee(Employee employee) throws Exception;
	
	public Employee searchEmployeeById(int employeeId);
	
	public boolean deleteEmployeeById(int employeeId);
	
	public Employee updateEmployee(Employee employee);
	
	public List<Employee> getAllEmployee();
	
	
	

}
