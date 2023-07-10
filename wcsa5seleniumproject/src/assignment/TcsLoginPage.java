package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TcsLoginPage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tcsion.com/dotcom/TCSSMB/Login/login.html");
		driver.findElement(By.xpath("//span[text()='Decline Optional Cookies']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='accountname'] ")).sendKeys("krishna@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@type,'pa')] ")).sendKeys("ddsojdkd");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Login'] [ ")).click();

		

//		driver
	}

}
