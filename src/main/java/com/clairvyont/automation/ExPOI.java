package com.clairvyont.automation;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExPOI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		XSSFWorkbook ExcelWBook;
		try {
			ExcelWBook = new XSSFWorkbook("C:\\Users\\harit\\OneDrive\\Desktop\\TestData\\TestData.xlsx");
			XSSFSheet ExcelWSheet = ExcelWBook.getSheet("Test");	
			XSSFCell Cell = ExcelWSheet.getRow(1).getCell(2);
			String cellData = Cell.getStringCellValue();
			System.out.println(cellData);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
