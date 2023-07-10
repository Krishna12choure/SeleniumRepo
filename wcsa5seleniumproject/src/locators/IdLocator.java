package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Krishna/Downloads/Text.html");
		
		WebElement name = driver.findElement(By.id("name"));
		
		name.sendKeys("Krishna");
		Thread.sleep(2000);
		
		driver.quit();//close the window
	}
}
