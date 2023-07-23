package flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flag1 {
  @Test(description = "Login Method!!")
  public void Method1() {
	  Reporter.log("Method1 from flag1");
  }
  
  @Test(description = "Logout Method!!")
  public void Method2() {
	  Reporter.log("Method2 from flag1");
  }
  
}
