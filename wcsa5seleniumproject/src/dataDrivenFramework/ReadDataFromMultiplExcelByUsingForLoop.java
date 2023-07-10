package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromMultiplExcelByUsingForLoop {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {

		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");

		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("IPL");

		for (int i = 1; i <= 10; i++) {
			Row row = sheet.getRow(i);

			for (int j = 0; j <= 1; j++) {
				Cell cell = row.getCell(j);

				String data = cell.getStringCellValue();
				Thread.sleep(2000);
				System.out.println(data);
			}

		}

	}
}
