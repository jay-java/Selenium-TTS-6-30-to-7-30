package hybrid;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriver {

	public static void getData() throws IOException {
		//to read file
		FileInputStream fis = new FileInputStream("C:\\Users\\jay-pc\\Desktop\\ExcelReader.xlsx");
		System.out.println(fis);

		// to read data from that excel file
		XSSFWorkbook workBook = new XSSFWorkbook(fis);
		System.out.println(workBook);

		// to check no of sheets available in file
		int sheets = workBook.getNumberOfSheets();
		System.out.println(sheets);

		for (int i = 0; i < sheets; i++) {
			if (workBook.getSheetName(i).equalsIgnoreCase("home")) {
				System.out.println(true);

				XSSFSheet sheet = workBook.getSheetAt(i);
				// to read single sheet
				// identify testCases column by scanning the entire 1st row
				Iterator<Row> rows = sheet.rowIterator();
				System.out.println(rows);

				// to fetch perticular row
				Row firstRow = rows.next();
				System.out.println(firstRow.toString());

				Iterator<Cell> ce = firstRow.cellIterator();
				System.out.println("cells : " + ce.toString());

				int k=0;
				int column = 0;
				while(ce.hasNext()) {
					Cell value = ce.next();
					System.out.println("Cell value : "+value);
					if(value.getRichStringCellValue().equals("TestCases")) {
						column = k;
					}
					k++;
				}
				System.out.println(column);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		getData();
	}
}
