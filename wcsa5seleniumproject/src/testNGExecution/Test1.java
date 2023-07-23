package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void testMethod1() throws InterruptedException {
	  System.setProperty("Webdriver.gecko.driver", "./drivers/geckodriver.exe");
	  WebDriver driver=new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.get("https://www.google.com");
	  WebElement act = driver.switchTo().activeElement();
	  act.sendKeys("Selenium",Keys.ENTER);
	  
	  Thread.sleep(2000);
	  driver.quit();
	  
  }
  
  
}
