package com.btc.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.btc.app.model.Employee;

public class EmployeeDaoJdbcImpl implements EmployeeDao {
	
	private Connection con;
	
	private PreparedStatement smt;
	
	
	public EmployeeDaoJdbcImpl() throws SQLException {
		con=ConnectionUtil.getDbConnection();
	}

	@Override
	public Employee addEmployee(Employee employee) throws SQLException {
		
		String dateString = employee.getDob().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		
		String query = "insert into empdb values(?,?,?,?)";
		
		
		smt= con.prepareStatement(query);
		
		smt.setInt(1, employee.getEmployeeId());
		smt.setString(2, employee.getEmployeeName());
		smt.setString(3, dateString);
		smt.setString(4, employee.getEmail());
		
		int insertedRowCount = smt.executeUpdate();
		if(insertedRowCount>0) {
			return employee;
		}
		return null;
	}

	@Override
	public Employee searchEmployeeById(int employeeId) throws SQLException {
		String query="select * from empdb where employeeId=?";
		smt=con.prepareStatement(query);
		
		smt.setInt(1, employeeId);	
		
		ResultSet queryResult = smt.executeQuery();
		
		Employee emp=null;
		
		if(queryResult.next()) {
			emp=new Employee();
			emp.setEmployeeId(employeeId);
			emp.setEmployeeName(queryResult.getString("employeeName"));
			emp.setEmail(queryResult.getString("email"));
			String dateString=queryResult.getString("dob");
			emp.setDob(LocalDate.parse(dateString));
		}
		
		return emp;
		
	}

	@Override
	public boolean deleteEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
