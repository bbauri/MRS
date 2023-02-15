package com.automation.Polymorphism.CompileTimePM.Overloading.Constructor_Overloading;

import org.openqa.selenium.devtools.Message;

public class ConstructorOverloadingTest {
	
	private int index;
	
	public ConstructorOverloadingTest() {
		
		index=0;
	}
	
	public ConstructorOverloadingTest(int indx) {
		
		index=indx;
	}
	
	public ConstructorOverloadingTest(double indx) {
		
		index= (int) indx;
	}
	
	public void display() {
		
		System.out.println("Index Value:" + index);
	}
	
	public static void main(String[] args) {
		
		ConstructorOverloadingTest cot =  new ConstructorOverloadingTest(48.3);
		
		cot.display();
		
		
	}

}
