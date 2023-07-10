package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase2 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		
		
		WebElement usn = driver.findElement(By.name("username"));
		usn.sendKeys("Admin");
	
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("admin123");
		
		WebElement lgn = driver.findElement(By.xpath("//button[.=' Login ']"));
		lgn.click();
		
		
		
	}

}
