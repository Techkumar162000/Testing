package com.Ecommerce;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Program {

	public static void writeData() throws IOException {
		File f = new File("C:\\Users\\91978\\eclipse-workspace\\Ecommerce\\Excel\\Excel momery1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wbs = new XSSFWorkbook(fis);
		wbs.createSheet("kumar").createRow(0).createCell(0).setCellValue("username");
		wbs.getSheet("kumar").getRow(0).createCell(1).setCellValue("password");
		wbs.getSheet("kumar").createRow(1).createCell(0).setCellValue("java");
		wbs.getSheet("kumar").getRow(1).createCell(1).setCellValue("123654");
		wbs.getSheet("kumar").createRow(2).createCell(0).setCellValue("selenium");
		wbs.getSheet("kumar").getRow(2).createCell(1).setCellValue("98745");
		wbs.getSheet("kumar").createRow(3).createCell(0).setCellValue("Testing");
		wbs.getSheet("kumar").getRow(3).createCell(1).setCellValue("54321");
		FileOutputStream fos = new FileOutputStream(f);
		wbs.write(fos);
		wbs.close();
		System.out.println("Write data sucessfully");
	}

	public static void main(String[] args) throws IOException {
		writeData();
	}

}
