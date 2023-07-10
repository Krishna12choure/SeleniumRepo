package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioSerchProduct {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	    WebDriver driver =new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.ajio.com/?gclid=Cj0KCQjwjryjBhD0ARIsAMLvnF84TVJxbbfEQIQ8VZsBPOzXEQeGeHY0kYgLvNmMTMhi10najRHvDZ0aAuO4EALw_wcB");
	    
		driver.findElement(By.xpath("//input[contains(@role,'combobox')] ")).sendKeys("Puma shoes");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(@class,'ic-search')]")).click();
		Thread.sleep(2000);
	}

}
