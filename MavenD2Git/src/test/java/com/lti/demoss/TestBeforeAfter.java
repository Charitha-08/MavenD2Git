package com.lti.demoss;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calculator;

class TestBeforeAfter {

	Calculator c=new Calculator();
	int sum=0;
	
	@BeforeAll
	public static void TestBeAll() {
		System.out.println("DB conn only once");
	}
	
	@BeforeEach
	public void testStratup() {
		sum=0;
		System.out.println("sum is "+sum);
	}
	
	@Test
	public void testAddTwoNo() {
		System.out.println("Teat cse1");
		int re=c.addNo(100, 200);
		Assertions.assertEquals(300,re);
	}
	
	@Test
	public void testsubNo() {
		System.out.println("Teat cse2");
		int r= c.subNo(100, 50);
		Assertions.assertEquals(50,r);
	}
	
	@AfterEach
	public void testShut() {
		System.out.println("some value null");
	}
	@AfterAll
	public static void TestAfterAll() {
		System.out.println("shut down of DB");
	}

}
