package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartCartLogin {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webDriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
 
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		driver.findElement(By.xpath("//span[text()=\"Cart\"] ")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _1sbqEe _3AWRsL\"]")).click();

	}
}
//Sychronization is an issue it is  occure due to the slow internate connection