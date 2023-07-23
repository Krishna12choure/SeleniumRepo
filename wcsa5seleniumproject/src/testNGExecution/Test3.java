package testNGExecution;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Test3 {
  @Test
  public void testMethod3() throws InterruptedException {
	  System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
	  WebDriver driver=new EdgeDriver();
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  
	  driver.get("https://www.google.com");
	  WebElement act = driver.switchTo().activeElement();
	  
	  act.sendKeys("sql",Keys.ENTER);
	  Thread.sleep(2000);
	  driver.quit();
	  
	  
  }
}
