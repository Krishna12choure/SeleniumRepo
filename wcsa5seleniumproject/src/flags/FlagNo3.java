package flags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlagNo3 {
  @Test(invocationCount = 5)
  public void Method1() {
	  Reporter.log("Method1",true);
  }
}
