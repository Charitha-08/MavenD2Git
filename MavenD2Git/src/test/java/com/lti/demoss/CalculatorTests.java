package com.lti.demoss;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calculator;

class CalculatorTests {
	
	Calculator c=new Calculator();
	
	@Test
	void testsayHello() {
		Assertions.assertEquals("Hello World", c.sayHello());
	}
	
	@Test
	public void testAddTwoNo() {
		int re=c.addNo(100, 200);
		Assertions.assertEquals(300,re);
	}
	
	@Test
	public void testsubNo() {
		int r= c.subNo(100, 50);
		Assertions.assertEquals(50,r);
	}
	
	@Test
	public void testAssertNulls() {
		String s1=null;
		String s2="abcdef";
		Assertions.assertNull(s1);
		
	}
	
	
	
}
