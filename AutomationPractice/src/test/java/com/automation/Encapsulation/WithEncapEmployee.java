package com.automation.Encapsulation;

public class WithEncapEmployee {

	public static void main(String[] args) {
		
		WithEncapTest wet1 = new WithEncapTest();
		wet1.setId(-1001);
		wet1.setName("Bhola");
		wet1.setSalary(898989.33);
		
		System.out.println(wet1.getId());
		System.out.println(wet1.getName());
		System.out.println(wet1.getSalary());
		

	}
}
