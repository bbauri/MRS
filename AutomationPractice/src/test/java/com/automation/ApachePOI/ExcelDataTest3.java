package com.automation.ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataTest3 {

	public static void main(String[] args) throws Throwable {
		
		
		File file = new File("Z:\\MindQ\\ExcelTest.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workb = WorkbookFactory.create(fis);
		System.out.println("#Sheets:" + workb.getNumberOfSheets());

		Sheet sheet = workb.getSheet("ExcelTest");
		
		for(int indc=0;indc<=2;indc++) {
		
		for(int indexcolumn=0;indexcolumn<5;indexcolumn++) {
			
			System.out.print(sheet.getRow(indc).getCell(indexcolumn).toString()+"\t");

	}
		System.out.println();

	}
		//WriteDATA
		sheet.getRow(0).createCell(5).setCellValue("Status");
		sheet.getRow(1).createCell(5).setCellValue("Pass");
		workb.write(new FileOutputStream(file));
		workb.close();
}}
