package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		Read data from IPL sheet

//		implemntation of read the data from Excel

		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");// For providing file path

		Workbook wb = WorkbookFactory.create(fis);// Make the file for ready to read it is an interface of POI
		Sheet sheet = wb.getSheet("IPL");// get into the sheet

		//if we have to read the data from excel sheet we use (rowno,columnno)
		
		Row row = sheet.getRow(3);//get into a desire row
		Cell cell = row.getCell(1);//get into a desire column/cell
		
		String data = cell.getStringCellValue();//To read the data from cell
		
		System.out.println(data);
	}

}
