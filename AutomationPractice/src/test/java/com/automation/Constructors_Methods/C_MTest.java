package com.automation.Constructors_Methods;

public class C_MTest {
	
	int id;
	String name;
	double salary;
	
	/*public static void main(String[] args) {
		
		C_MTest cm = new C_MTest();
		
		cm.id=1001;
		cm.name="Bhola";
		cm.salary=889988.22;
				
		System.out.println(cm.id);
		System.out.println(cm.name);
		System.out.println(cm.salary);
		
		C_MTest cm1 = new C_MTest();
		
		cm1.id=1002;
		cm1.name="Barun";
		cm1.salary=999999.80;
		
		System.out.println(cm1.id);
		System.out.println(cm1.name);
		System.out.println(cm1.salary);
	}*/

	C_MTest(int empid,String empname,double empsalary) {
		
		System.out.println("Employee ID  "+ "Emplyee Name" + "   Employee Salary");
		
		id=empid;
		name=empname;
		salary=empsalary;
	}
		void display() {
		
			System.out.println(id +"    "+ "     "+name + "          "+  salary);
		}
		
		public static void main(String[] args) {
		
			C_MTest cm = new C_MTest(1001,"Bhola",8989884.22);
					cm.display();
			
			C_MTest cm1 = new C_MTest(1002, "Barun",8988989.20);
			cm1.display();
		}
		
	
}
