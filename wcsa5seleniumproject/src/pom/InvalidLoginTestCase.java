package pom;

import java.io.IOException;

public class InvalidLoginTestCase extends BaseTest {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		// launch the browsers & application
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		//perform invalid Login
		// go into the login page
		Loginpage lp = new Loginpage(driver);
		
		//read the data from excelFile
		Flib flib = new Flib();
		int rc = flib.getLastRowCount(EXCEL_PATH,"invalidcreds");
		
		for(int i=1;i<=rc;i++)
		{
		lp.inValidLoginMethod(flib.readExcelData(EXCEL_PATH,"invalidcreds",i,0),flib.readExcelData(EXCEL_PATH,"invalidcreds",i,1));
		}
	}

}