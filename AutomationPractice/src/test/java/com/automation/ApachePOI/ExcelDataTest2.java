package com.automation.ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataTest2 {

	public static void main(String[] args) throws Throwable {
		
		File file = new File("Z:\\MindQ\\ExcelTest.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workb = WorkbookFactory.create(fis);
		System.out.println("#Sheets:" + workb.getNumberOfSheets());

		Sheet sheet = workb.getSheet("ExcelTest");
		
		for(int indexcolumn=0;indexcolumn<5;indexcolumn++) {
			
			System.out.print(sheet.getRow(0).getCell(indexcolumn).toString()+"\t");

	}
		System.out.println();
	
		for(int indexcolumn=0;indexcolumn<5;indexcolumn++) {
			
			System.out.println(sheet.getRow(1).getCell(indexcolumn).toString()+"\t");

	}
		System.out.println();
		for(int indexcolumn=0;indexcolumn<5;indexcolumn++) {
			
			System.out.print(sheet.getRow(2).getCell(indexcolumn).toString()+"\t");
		}
	}
}
