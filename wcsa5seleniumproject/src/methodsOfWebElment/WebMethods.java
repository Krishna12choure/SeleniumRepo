package methodsOfWebElment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebMethods {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriiver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.saucedemo.com/");
		
		 WebElement usn = driver.findElement(By.id("user-name"));
		 usn.sendKeys("send");//sendkeys
		 Thread.sleep(2000);
//		 usn.clear();//clear
		 
		 WebElement lgb =driver.findElement(By.id("login-button"));
		 //lgb.click();//click
		 
		if(lgb.isDisplayed())
		{
			System.out.println("Is Display Method");
		}
	}

}
