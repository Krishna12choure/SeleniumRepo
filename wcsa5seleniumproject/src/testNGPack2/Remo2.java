package testNGPack2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Remo2 {
	 @Test
	  public void m1() {
		  
		  Reporter.log("Demo1 TestNG class from Remo1",true);
		  
	  }
	  
	  @Test
	  public void m2()
	  {
		Reporter.log("m2 method from Remo1", true);  
	  }
	  
}
