package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {

	private static XSSFWorkbook wBook;
	private static XSSFSheet wSheet;

	public static void setExcelFile(String path, String sheetName) {

		try {
			FileInputStream fis = new FileInputStream(path);
			wBook = new XSSFWorkbook(fis);
			wSheet = wBook.getSheet(sheetName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String[][] getTestData(String tableName) {
		String[][] testData = null;

		DataFormatter df = new DataFormatter();
		XSSFCell[] boundaryCells = findBoundaryCells(tableName);

		XSSFCell startCell = boundaryCells[0];
		XSSFCell endCell = boundaryCells[1];

		int startRow = startCell.getRowIndex() + 1; //0+1=1
		int endRow = endCell.getRowIndex() - 1;     //4-1=3

		int startCol = startCell.getColumnIndex() + 1;  //0+1=1
		int endCol = endCell.getColumnIndex() - 1;      //3-1=2

		testData = new String[endRow - startRow + 1][endCol - startCol + 1]; //[2][1]

		for (int i = startRow; i < endRow + 1; i++) {
			for (int j = startCol; j < endCol + 1; j++) {
				Cell cell = wSheet.getRow(i).getCell(j);
				testData[i - startRow][j - startCol] = df.formatCellValue(cell);
			}
		}

		return testData;
	}

	private static XSSFCell[] findBoundaryCells(String tableName) {
		DataFormatter df = new DataFormatter();

		String pos = "begin";
		XSSFCell[] cells = new XSSFCell[2];

		for (Row row : wSheet) {
			for (Cell cell : row) {
				if (tableName.equals(df.formatCellValue(cell))) {
					if (pos.equals("begin")) {
						cells[0] = (XSSFCell) cell;
						pos = "end";
					} else {
						cells[1] = (XSSFCell) cell;
					}
				}
			}

		}
		return cells;
	}

}
