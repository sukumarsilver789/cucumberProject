package excelDataHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public void printExcelData() throws IOException {
		
		File file = new File("C:\\Users\\sukumar.busipalli\\Desktop\\SAFHIRE.xlsx");	
		
		FileInputStream readFile = new FileInputStream(file);
		
		XSSFWorkbook myWorkBook = new XSSFWorkbook(readFile);
		
		XSSFSheet readSheet	 = myWorkBook.getSheetAt(0);
		
		Iterator<Row> rowIterator = readSheet.iterator();
		
		while (rowIterator.hasNext()) {
            Row row = rowIterator.next();

            // For each row, iterate through each columns
            Iterator<Cell> cellIterator = row.cellIterator();
            while (cellIterator.hasNext()) {

                Cell cell = cellIterator.next();
                
                System.out.print( cell.getCellType().toString());
				//System.out.print( cell.getStringCellValue());
				
			}
		}
	}
}
