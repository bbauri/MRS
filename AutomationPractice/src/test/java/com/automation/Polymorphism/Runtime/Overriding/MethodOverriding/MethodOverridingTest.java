package com.automation.Polymorphism.Runtime.Overriding.MethodOverriding;

public class MethodOverridingTest {
	
	private int id;
	private String name;
	private double salary;
	
	public MethodOverridingTest(int id,String name,double salary) {
		
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		
		return id+" "+name+" "+salary;
	}

	public static void main(String[] args) {
		
		MethodOverridingTest mot =  new MethodOverridingTest(1001, "Bhola", 898989.32);
		System.out.println(mot.toString());
		
	}
}
