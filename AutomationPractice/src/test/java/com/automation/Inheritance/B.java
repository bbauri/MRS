package com.automation.Inheritance;

public class B extends A {
	
	public void m2() {
		
		System.out.println("M2 method of class B");
	}
	public static void main(String[] args) {
		
		B b= new B();
		b.m1();
		b.m2();
	}
}
