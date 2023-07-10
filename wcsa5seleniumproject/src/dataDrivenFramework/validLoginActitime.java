package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validLoginActitime {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://desktop-6pv51og/login.do");
		Thread.sleep(2000);

//		read the data from excel sheet and  test the login page

		FLib flib = new FLib();

		String validUsername = flib.readExcelData("./data/ActitimeTestData.xlsx", "validcreds", 1, 0);
		String validPassword = flib.readExcelData("./data/ActitimeTestData.xlsx", "validcreds", 1, 1);
		
		driver.findElement(By.name("username")).sendKeys(validUsername);
		
		driver.findElement(By.name("pwd")).sendKeys(validPassword);
		
		driver.findElement(By.id("loginButton")).click();
		
		

	}

}
