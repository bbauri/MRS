package com.automation.Conditional_Statements;

public class IfElseIfTest {

	public static void main(String[] args) {
		
		String input ="null";
		
		if(input.equals("chrome")) {
			
			System.out.println("Chrome Browser Eexecution");
		}else if(input.equals("edge")) {
			
			System.out.println("Edge Browser Execution");
		}else if(input.equals("firefox")) {
			
			System.out.println("Firefox Browser Execution");
		}else {
			
			System.out.println("<<<No Browser Found To Eexecute>>>");
		}

	}

}
