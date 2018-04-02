package com.clairvoyant.helper;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.clairvoyant.datadriven.Constant;

public class ExcelHelper {
	
	private static XSSFSheet ExcelWSheet;
	private static XSSFWorkbook ExcelWBook;
	private static XSSFCell Cell;
	private static XSSFRow Row;
	
	public static void setExcelFile(String path, String sheetName) throws Exception{
		try {
		FileInputStream input = new FileInputStream(path);
		
		ExcelWBook = new XSSFWorkbook(input);
		ExcelWSheet = ExcelWBook.getSheet(sheetName);	
		}
		catch(Exception e){
			
			System.out.println(e);
		}
		
	}
	
	public static String getCell(int rowNum,int colNum) throws Exception{
		
		try {
			
			Cell = ExcelWSheet.getRow(rowNum).getCell(colNum);
			String cellData = Cell.getStringCellValue();
			return cellData;
		}
		catch(Exception e) {
			
			return "";
		}
		
	}
	
	public static void setCellData(String result, int rowNum,int colNum) {
		
		try {
			Row = ExcelWSheet.getRow(rowNum);
			Cell = Row.getCell(colNum);
			if(Cell == null) {
				Cell = Row.createCell(colNum);
				Cell.setCellValue(result);
			}
			else {
				Cell.setCellValue(result);
			}
			FileOutputStream output = new FileOutputStream(Constant.Path_TestData + Constant.File_TestData);
			ExcelWBook.write(output);
			
			
		}
		catch(Exception e) {
			
			System.out.println(e);
		}
		
		
	}
}
	
	

	