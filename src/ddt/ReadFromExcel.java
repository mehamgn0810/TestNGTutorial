package ddt;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcel {

	public static void main(String[] args) {

		XSSFWorkbook wBook;
		XSSFSheet wSheet;
		XSSFCell cell;

		String path = "C:\\Users\\MEHAVARNAN\\Documents\\eclipse-workspace\\TestNGTutorial\\src\\utilities\\ExcelRead.xlsx";

		FileInputStream fis;
		try {
			fis = new FileInputStream(path);
			wBook = new XSSFWorkbook(fis);
			wSheet = wBook.getSheet("Sheet1");
			cell = wSheet.getRow(0).getCell(0);
			String cellValue = cell.getStringCellValue();
			System.out.println("Value in the cell is: " + cellValue);
			wBook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}