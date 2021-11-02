package com.btc.app.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import com.btc.app.model.Employee;

class EmployeeDaoImplTest {

	EmployeeDao dao=new EmployeeDaoImpl();
	
	
	
	@Test
	void testAddEmployee() {
		Employee emp=new Employee(1006,"Uttam Reddy",LocalDate.parse("1994-02-10"),"uttam@gmail.com");
		
		//assertEquals(emp, dao.addEmployee(emp));
		
	}

	@Test
	void testSearchEmployeeById() {
		
	}

	@Test
	void testDeleteEmployeeById() {
		//assertTrue(dao.deleteEmployeeById(1006));
	}

	@Test
	void testUpdateEmployee() {
		
	}

	@Test
	void testGetAllEmployee() {
		
	}

}
