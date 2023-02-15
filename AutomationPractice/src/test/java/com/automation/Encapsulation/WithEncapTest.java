package com.automation.Encapsulation;

public class WithEncapTest {

	private int id;
	private double salary;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		
		if(id<=0) {
			
			System.out.println("Invalid Employee ID");
			System.exit(1);
		}else {
		}
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	


}
