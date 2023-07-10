package dataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewActi {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-6pv51og/login.do");
		
		Thread.sleep(2000);
		
		Inval nf = new Inval();
		int sc = nf.getLastRowCount("./data/ActitimeTestData.xlsx", "invalidcreds");
		for(int i=0;i<=sc;i++) {
		String invalidusn = nf.readDatainval("./data/ActitimeTestData.xlsx", "invalidcreds", i, 0);
		String invalidpass = nf.readDatainval("./data/ActitimeTestData.xlsx", "invalidcreds", i, 1);	
		
		Thread.sleep(2000); 
		
		driver.findElement(By.name("username")).sendKeys(invalidusn);
		driver.findElement(By.name("pwd")).sendKeys(invalidpass);
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).clear();
		
		}
		
	
	}

}
