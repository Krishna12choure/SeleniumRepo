package actionsClassMethods;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActitimeDoubleClickMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://desktop-6pv51og/login.do");
//		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedCondition<driver.>)
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.xpath("//a[text()='Login']"));
		//To perform right click
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();
		Thread.sleep(3000);
		act.contextClick().perform();
		
		
	}
	
}
