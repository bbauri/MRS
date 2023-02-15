package com.automation.Exceptions.UncheckedException;

public class UncheckedExceptionTest {

	public static void main(String[] args) {
	
		System.out.println("Start");
		try {
	
		int i = 100/0;
		}catch(ArithmeticException exception) {
			
			System.out.println(exception.toString());
		}finally{
			
			System.out.println("Finally no error");
		}
		System.out.println("End");
		
	

}
}
