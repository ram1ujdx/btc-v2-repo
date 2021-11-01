package com.btc.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

@TestInstance(Lifecycle.PER_CLASS)
class AppTest {

	//	BeforeEach
	//	AfterEach
	//	BeforeAll
	//	AfterAll
	
	App obj;
	
	@BeforeAll
	public void initAllTest() {
		System.out.println("Test Begin...");
	}
	
	@AfterAll
	public void finalizeTest() {
		System.out.println("All tests are completed..");
	}
	
	@BeforeEach
	public void initATest() {
		System.out.println("Test Started...");
		obj=new App();
	}
	
	
	@AfterEach
	public void completeATest() {
		System.out.println("Test Completed...");
		obj=null;
	}
	
	@Test
//	@DisabledOnJre(value = JRE.JAVA_11)
//	@DisabledOnOs(value = OS.MAC)
	public void testAdd() {
		
		int result = obj.add(5, 7);
		assertEquals(12, result);
	}
	
	@Nested
	class DivideTests{
	@Test
//	@EnabledOnJre(value = JRE.JAVA_11)
	public void divideTest() {
		
		int result = obj.divide(20, 4);
		assertEquals(5, result);
	}
	
	
	@Test
	public void divideExceptionTest() {
		
		assertThrows(ArithmeticException.class, () -> obj.divide(20, 0));
	}
	}
}
