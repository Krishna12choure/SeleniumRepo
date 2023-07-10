package synchronization;
// Get org.openqa.selenium.WebDriverException 
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActitimeSynchronization {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-aigvo6j/login.do");
		
		String actualTitleofLoginpage=driver.getTitle();
		explicitWaitMethod(driver,30,actualTitleofLoginpage);
		System.out.println("Title is match, Test case pass");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		System.out.println("Title is matched,Test case Passed!!");
		
		
		//driver.findElement(By.linkText("Logout")).click();
	}
	
	public static void explicitWaitMethod(WebDriver driver,int sec,String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.titleContains(title));
	}

}
