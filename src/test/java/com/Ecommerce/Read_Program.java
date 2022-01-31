package com.Ecommerce;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Program {
	public static void Particularcell() throws Throwable {
		File f = new File("C:\\Users\\91978\\eclipse-workspace\\Ecommerce\\Excel\\Excel momery.xlsx");
		FileInputStream f1 = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(f1);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(3);
		Cell cell = row.getCell(1);
		CellType cellType = cell.getCellType();
		if (cellType.equals(CellType.STRING)) {
			String scv = cell.getStringCellValue();
			System.out.println(scv);
		} else if (cellType.equals(CellType.NUMERIC)) {
			double ncv = cell.getNumericCellValue();
			int value = (int) ncv;
			System.out.println(value);

		}
	}

	public static void Alldata() throws Throwable {
		File f = new File("C:\\Users\\91978\\eclipse-workspace\\Ecommerce\\Excel\\Excel momery.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sa = wb.getSheetAt(0);
		int pnr = sa.getPhysicalNumberOfRows();
		for (int i = 0; i < pnr; i++) {
			Row row = sa.getRow(i);
			int physicalNumberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < physicalNumberOfCells; j++) {
				Cell c = row.getCell(j);
				CellType cellType = c.getCellType();
				if (cellType.equals(cellType.STRING)) {
					String value = c.getStringCellValue();
					System.out.println(value);

				} else if (cellType.equals(cellType.NUMERIC)) {
					double NCV = c.getNumericCellValue();
					int value = (int) NCV;
					System.out.println(value);

				}
			}

		}
	}

	public static void particularcolum() throws Throwable {
		File f = new File("C:\\Users\\91978\\eclipse-workspace\\Ecommerce\\Excel\\Excel momery.xlsx");
		FileInputStream fl = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fl);
		Sheet sa = wb.getSheetAt(0);
		int pnr = sa.getPhysicalNumberOfRows();
		for (int i = 0; i < pnr; i++) {
			Row row = sa.getRow(i);
			Cell c = row.getCell(1);
			CellType cellType = c.getCellType();
			if (cellType.equals(cellType.STRING)) {
				String value = c.getStringCellValue();
				System.out.println(value);

			} else if (cellType.equals(cellType.NUMERIC)) {
				double NCV = c.getNumericCellValue();
				int value = (int) NCV;
				System.out.println(value);

			}

		}
	}

	public static void main(String[] args) throws Throwable {
		System.out.println("******particularcell********");
		Particularcell();
		System.out.println("***alldata********");
		Alldata();
		System.out.println("*****particularcolum******");
		particularcolum();

	}

}



