package annotation;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSerchTestCase extends BaseTest {
	
  @Test
  public void serach1()  {
	  driver.switchTo().activeElement().sendKeys("google.in",Keys.ENTER);
	  
  }
  
  @Test
  public void serach2() 
  {
	  driver.switchTo().activeElement().sendKeys("How to hack google",Keys.ENTER);
	  
  }
  @Test
  public void serach3()
  {
	  driver.switchTo().activeElement().sendKeys("sql",Keys.ENTER);
	 
  }
  
}
