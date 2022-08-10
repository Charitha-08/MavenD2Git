package com.lti.demoss;

import static org.junit.jupiter.api.Assertions.*;


import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PrametersTest {

	@ParameterizedTest
	@ValueSource(ints= {8,10,30,16,20})
	public void testIntAnyParam(int arg) {
		System.out.println("arg :"+arg);
		Assertions.assertTrue(arg%2==0);
	}
	
	@DisplayName("should pass all cases if not null")
	@ParameterizedTest
	@ValueSource(strings= {"Hello", "World"})
	public void testStringparam(String msg) {
		
		Assertions.assertNotNull(msg);
	}
	
	@Test
	public void testLamdaList() {
		
		Integer[] intAr= {10,20,5,25};
		List<Integer>  intlist=Arrays.asList(intAr);
		
		Assertions.assertAll(
					()->assertEquals(10, intlist.get(0)),
					()->assertEquals(20, intlist.get(1)),
					()->assertEquals(5, intlist.get(2)),
					()->assertEquals(25, intlist.get(3))
					
					);
		
	}
	
	@RepeatedTest(value=3,name="Repeat 3 times")
	public void repeatTest() {
		
		int a=10,b=20;
		Assertions.assertEquals(200,(a*b));
	}

}
