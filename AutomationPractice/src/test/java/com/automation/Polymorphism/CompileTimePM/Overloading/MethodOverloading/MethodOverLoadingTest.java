package com.automation.Polymorphism.CompileTimePM.Overloading.MethodOverloading;

import org.openqa.selenium.remote.http.Message;

public class MethodOverLoadingTest {
	
	public static void display() {
		
		System.out.println("Hello......");
	}
	
	public static void display(String FName) {
		
		System.out.println("Hello......"+FName);
		
	}
	
	public static void display(String FName, String LName) {

		System.out.println("Hello......"+FName+" "+LName);
}
	public static void main(String[] args) {
		
		MethodOverLoadingTest mot = new MethodOverLoadingTest();
		
		mot.display();
		mot.display("Bhola");
		mot.display("Bhola", "Bauri");

		
	}
	
}
