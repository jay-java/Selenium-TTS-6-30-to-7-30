package reader;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderClass {
	public static void main(String[] args) throws IOException {
		//to read excel file from storage
		XSSFWorkbook workBook = new XSSFWorkbook("C:\\Users\\jay-pc\\Desktop\\ExcelReader.xlsx");
		System.out.println(workBook);
		//to read perticular sheet from file
		XSSFSheet workSheet = workBook.getSheet("home");
		System.out.println(workSheet);
		//to check number rows in which data is present
		int n = workSheet.getPhysicalNumberOfRows();
		System.out.println("row : "+n);
//		to check number col(data in single row) in which data is present
		int c = workSheet.getRow(5).getPhysicalNumberOfCells();
		System.out.println("col : "+c);
		XSSFCell cell = workSheet.getRow(1).getCell(2);
		System.out.println(cell.toString());
	}
	
}
