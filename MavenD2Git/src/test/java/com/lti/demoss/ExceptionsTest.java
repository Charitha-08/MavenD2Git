package com.lti.demoss;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calculator;

class ExceptionsTest {

	@Test
	void testExceptions() {
		
		//program for checking actually it is thowing 
		//illegal argument exception
		//dev writes exceptions-junit checks whther
		//those exceptions are handles or not
		
		Assertions.assertThrows(IllegalArgumentException.class,
				()->{Integer.parseInt("one");});
	}
		
		

	@Test
	public void testmethodexp() {
		Calculator c= new Calculator();
		final Exception e=assertThrows(ArithmeticException.class,
							()->{c.searchEmp(0);});
		
		Assertions.assertEquals("u entered zero" ,e.getMessage());
				
				
	}
		
	
	
	

}
