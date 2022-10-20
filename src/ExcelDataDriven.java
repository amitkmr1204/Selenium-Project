import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class ExcelDataDriven {
	
	public ArrayList<String> getdata(String testcasename) throws IOException {
		
		ArrayList<String> arr = new ArrayList<String>();
		
		FileInputStream fis = new FileInputStream("C:\\Selenium\\TestData.xlsx");

		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		int sheets = workbook.getNumberOfSheets();

		for (int i = 0; i < sheets; i++) {

			if (workbook.getSheetName(i).equalsIgnoreCase("Testdemo")) {

				XSSFSheet sheet = workbook.getSheetAt(i);

				// identify the test case column by scannning the entire 1st row

				Iterator<Row> rows = sheet.iterator(); // sheet is collection of row

				Row firstRow = rows.next();

				Iterator<org.apache.poi.ss.usermodel.Cell> ce = firstRow.cellIterator(); // row is collection of cell
				int k = 0;
				int column = 0;
				while (ce.hasNext()) {

					org.apache.poi.ss.usermodel.Cell value = ce.next();

					if (value.getStringCellValue().equalsIgnoreCase("Test Case")) {

						column = k;
					}
					k++;

				}
				System.out.println(column);

				while (rows.hasNext()) {

					Row r = rows.next();

					if (r.getCell(column).getStringCellValue().equalsIgnoreCase(testcasename)) {

						Iterator<org.apache.poi.ss.usermodel.Cell> cv = r.cellIterator();
						
						while (cv.hasNext()) {
							
						org.apache.poi.ss.usermodel.Cell c = cv.next();
							
							if(c.getCellType()==CellType.STRING) {

							arr.add(c.getStringCellValue());
							}
						
							else {
								arr.add(NumberToTextConverter.toText(c.getNumericCellValue()));
							}
					}
					}
				}

			}
		}
		return arr;
	}
	
	}
