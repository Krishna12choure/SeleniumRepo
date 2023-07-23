package flags;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSerchTestCase extends BaseTest {
	
  @Test(description = "TestCase1")
  public void serach1()  {
	  driver.switchTo().activeElement().sendKeys("google.in",Keys.ENTER);
	  
  }
  
  @Test(description = "TestCase2")
  public void serach2() 
  {
	  driver.switchTo().activeElement().sendKeys("How to hack google",Keys.ENTER);
	  
  }
  @Test(description = "TestCase3")
  public void serach3()
  {
	  driver.switchTo().activeElement().sendKeys("sql",Keys.ENTER);
	 
  }
  
}
