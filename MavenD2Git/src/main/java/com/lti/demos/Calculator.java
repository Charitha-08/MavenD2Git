package com.lti.demos;

public class Calculator {

	public String sayHello() {
		return "Hello World";
		}
	public int addNo(int x, int y) {
		int result=x+y;
		return result;
	}
	public int subNo(int x,int y) {
		int re=x-y;
		return re;
	}
	
	public void searchEmp(int empId) {
		if(empId==0) {
			throw new ArithmeticException("u entered zero");
		}
		else {
			System.out.println("do some task");
		}
			
	}
}
