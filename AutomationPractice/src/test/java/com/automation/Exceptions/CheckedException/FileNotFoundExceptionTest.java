package com.automation.Exceptions.CheckedException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionTest {

	/*public static void main(String[] args) throws FileNotFoundException {
		// Throwable, Exception

		File file =  new File("Z:\\testdata.txt");
		
		FileInputStream fip = new FileInputStream(file);
		
		
	}*/
	
	//Try&Catch Exception

	public static void main(String[] args) {
	
		
		try {
		File file =  new File("Z:\\testdata.txt");
		
		FileInputStream fip = new FileInputStream(file);
		
		
	}catch(FileNotFoundException fips) {
		System.out.println("TEST"+fips.toString());
	}
}}