package com.automation.ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelDataTest {

	public static void main(String[] args) throws Throwable {
		
		
		File file = new File("Z:\\MindQ\\ExcelTest.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workb = WorkbookFactory.create(fis);
		System.out.println("#Sheets:" + workb.getNumberOfSheets());

		Sheet sheet = workb.getSheet("ExcelTest");
		
		System.out.print(sheet.getRow(0).getCell(0).toString()+"\t");
		System.out.print(sheet.getRow(0).getCell(1).toString()+"\t");
		System.out.print(sheet.getRow(0).getCell(2).toString()+"\t");
		System.out.print(sheet.getRow(0).getCell(3).toString()+"\t");
		System.out.println(sheet.getRow(0).getCell(4).toString()+"\t");
		
		System.out.print(sheet.getRow(1).getCell(0).toString()+"\t"+"\t");
		System.out.print(sheet.getRow(1).getCell(1).toString()+"\t"+"\t");
		System.out.print(sheet.getRow(1).getCell(2).toString()+"\t"+"\t");
		System.out.print(sheet.getRow(1).getCell(3).toString()+"\t"+"\t");
		System.out.println(sheet.getRow(1).getCell(4).toString()+"\t"+"\t");
		
		System.out.print(sheet.getRow(2).getCell(0).toString()+"\t"+"\t");
		System.out.print(sheet.getRow(2).getCell(1).toString()+"\t"+"\t");
		System.out.print(sheet.getRow(2).getCell(2).toString()+"\t"+"\t");
		System.out.print(sheet.getRow(2).getCell(3).toString()+"\t"+"\t");
		System.out.print(sheet.getRow(2).getCell(4).toString()+"\t"+"\t");
		
		
		
		
	}

}
