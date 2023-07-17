package testNGPackage;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
//All the annotation should be followed method
//Each @ annotaion is consider as 1 test case
public class Demo {
  @Test
  public void f() throws InterruptedException {
	  
//	  System.out.println("This is demo TestNG class");
	  
//	  Reporter.log("This is demo TestNG class");
	  
	  
	  
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	  
	  driver.get("https://www.google.com");
	  
	  driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
	  Thread.sleep(2000);
	  
	  driver.quit();
	  Reporter.log("This is demo TestNG class", true);
	  
  }
}
