package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramSychronization {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name*='er']")).sendKeys("krishna@gmail.com");

		driver.findElement(By.cssSelector("input[name*='word']")).sendKeys("abcdef6");

		driver.findElement(By.cssSelector("button[class*='ap ']")).click();

	}

}
