package com.automation.Interface;

public class ImplementationsOfInterface implements I3  {

	@Override
	public void m1() {
		System.out.println("M1 Interface Method");
		
	}

	@Override
	public void m2() {
		System.out.println("M2 Interface Method");
		
	}

	@Override
	public void m3() {
		System.out.println("M3 Interface Method");
		
	}
	
	public static void main(String[] args) {
		
		I3 i3 = new ImplementationsOfInterface();
		i3.m1();
		i3.m2();
		i3.m3();
	}

}
