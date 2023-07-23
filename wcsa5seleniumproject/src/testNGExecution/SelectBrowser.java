package testNGExecution;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SelectBrowser {
	static WebDriver driver;
  @Test
  @Parameters({"browser","url","Vusername","Vpassword"})
  public void testParallelmethod(String browservalue,String url,String usn,String pass) throws InterruptedException
  {
	  if(browservalue.equalsIgnoreCase("Chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get(url);
		  Thread.sleep(2000);
		  driver.quit();
	  }
	  else if(browservalue.equalsIgnoreCase("Firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get(url);
		  Thread.sleep(2000);
		  driver.quit();
		  
	  }
	  
	  else if(browservalue.equalsIgnoreCase("edge"))
	  {
		  System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
		  driver=new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  driver.get(url);
		  Thread.sleep(2000);
		  driver.quit();
	  }
	  
	  else
	  {
		  System.out.println("Enter valid browsername");
	  }
	  
  }
}
