package xpathLocator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathCase4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9325245579");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@id='passContainer']")).sendKeys("abcgfs6");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[.='Log in']")).click();
		
		driver.close();
		
	}

}
