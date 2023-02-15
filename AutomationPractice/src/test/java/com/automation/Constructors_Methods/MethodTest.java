package com.automation.Constructors_Methods;

public class MethodTest {
	
	//Non-Static method test
	void method1() {
		
		System.out.println("Non Static Method Test");
	}
	//Static method test
		static void method2() {
			
			System.out.println("Static Method Test");
		}
	
	public static void main(String[] args) {
		
		System.out.println("Main Method Execution");
		//Non-static
		MethodTest mt= new MethodTest();
		mt.method1();

		//Static
		MethodTest.method2();
		
	}
		
	}


