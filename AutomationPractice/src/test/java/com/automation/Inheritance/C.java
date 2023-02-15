package com.automation.Inheritance;

public class C extends B{

	
	public void m3() {
		
		System.out.println("M3 method of class C");
	}
	
	public static void main(String[] args) {
		
		C c = new C();
		c.m1();
		c.m2();
		c.m3();
	}
}
