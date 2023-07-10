package methodsOfWebElment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-6pv51og/login.do");
		
		WebElement userTB = driver.findElement(By.name("username"));
		WebElement passworTB = driver.findElement(By.name("pwd"));
		
		userTB.sendKeys("admin");
		passworTB.sendKeys("admin");
		Thread.sleep(2000);
		userTB.clear();
		passworTB.clear();
		
	}

}