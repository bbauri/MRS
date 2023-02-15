package com.automation.ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelTest1 {

	public static void main(String[] args) throws Exception {

		File file = new File("Z:\\MindQ\\ExcelTest.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook workb = WorkbookFactory.create(fis);
		System.out.println("#Sheets:" + workb.getNumberOfSheets());

		Sheet sheet = workb.getSheet("ExcelTest");
		System.out.println("#Rows with Data:" + sheet.getPhysicalNumberOfRows());
		System.out.println("FirstRowNumber:"+sheet.getFirstRowNum());
		System.out.println("LastRowNumber:"+sheet.getLastRowNum());
		System.out.println("#NumberOfColumns with Data:"+sheet.getRow(0).getPhysicalNumberOfCells());
		System.out.println("FirsColumnsNumber:"+sheet.getRow(0).getFirstCellNum());
		System.out.println("LastColumnsNumber:"+sheet.getRow(0).getLastCellNum());
		
		 
		workb.close();

	}

}
