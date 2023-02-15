package com.automation.Abstract_Classes;

public class Implementations_ACTest extends ACTest {

	@Override
	public void m1() {
		System.out.println("M1 Method of Abstract Class extended to Implementations_ACTest");
		
	}
	
	public static void main(String[] args) {
		
		Implementations_ACTest iact = new Implementations_ACTest();
		
		iact.m1();
		iact.m2();
	}

}
