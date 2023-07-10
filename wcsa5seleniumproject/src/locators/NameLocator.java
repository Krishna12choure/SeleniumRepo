package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://desktop-6pv51og/login.do");
		Thread.sleep(2000);
		WebElement usn = driver.findElement(By.name("username"));
		usn.sendKeys("omayo@gmail.com");
		Thread.sleep(2000);
		
		WebElement pwd =driver.findElement(By.name("pwd"));
		pwd.sendKeys("trr12y2");
		Thread.sleep(2000);
		
	}

}
