package com.automation.Access_Modifiers.Package2;

import com.automation.Access_Modifiers.Package1.A;

public class C {
	
	//Private access  modifiers
	/*public static void main(String[] args) {
		
		A a = new A();
		a.display()
	}*/
	
	//Default access  modifiers
		/*public static void main(String[] args) {
			
			A a = new A();
			a.display()
		}*/
	//Protected access modifiers, extends A calss	
	/*public static void main(String[] args) {
		
		C c = new C();
		c.display();
	}*/
	
	//Public access modifiers

	public static void main(String[] args) {
		
		A a = new A();
		a.display();
	}
}
