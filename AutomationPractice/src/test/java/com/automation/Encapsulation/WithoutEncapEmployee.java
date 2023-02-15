package com.automation.Encapsulation;

public class WithoutEncapEmployee {

	public static void main(String[] args) {
		
		WithoutEncapTest1 wet =  new WithoutEncapTest1();
		wet.id=-1001;
		wet.salary=898989.33;
		wet.name="Bhola";
		
		System.out.println(wet.id);
		System.out.println(wet.name);
		System.out.println(wet.salary);
	}

}
